/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author WOCHIENG1
 */
public class CurlSendSMS {
    Process process;
    
    
    String command = "curl -X -k --insecure POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'X-Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ3eWJvc29mdF9hcGl1c2VyIiwiYXVkIjoiQUNDRVNTIiwic2NvcGVzIjoiQURNSU4iLCJpc3MiOiJodHRwOi8vc2l4ZGVlLmNvbSIsImlhdCI6MTYxMTY0NjE3MiwiZXhwIjoxNjExNjU1MTcyfQ.KadHuUcczliKM-D53VVPe_gKelzLMLxoAi43fBXDLoPBBK0M6RrLz_kys8MvYdlgK4_CXGMH2g68qvQE5ROCDQ' -d '{  \n" +
"   \"timeStamp\": \"1556873649895\",  \n" +
"   \"dataSet\": [  \n" +
"     {  \n" +
"       \"oa\": \"TestSDP\",  \n" +
"       \"channel\": \"sms\",  \n" +
"       \"userName\": \"wycliffe\",  \n" +
"       \"msisdn\": \"254715404086\",  \n" +
"       \"message\": \"Hi hello SMS DTOne\",  \n" +
"       \"uniqueId\": \"jib123456777778\",  \n" +
"       \"actionResponseURL\": \"https://posthere.io/f815-46bc-b480\"  \n" +
"     }  \n" +
"   ]  \n" +
" }' 'https://dtsvc.safaricom.com:8480/api/public/CMS/bulksms'";
    
    
    
    ProcessBuilder processBuilder = new ProcessBuilder(command); 
    
    public static void main(String...vargs) throws Exception{
        
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null; }
            public void checkClientTrusted(X509Certificate[] certs, String authType) { }
            public void checkServerTrusted(X509Certificate[] certs, String authType) { }

        } };

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) { return true; }
        };
        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        /* End of the fix*/

        //URL url = new URL("https://dtsvc.safaricom.com:8480/api/public/CMS/bulksms");
        //URLConnection con = url.openConnection();
        
        CurlSendSMS send = new CurlSendSMS();
        try {
            send.sendSMS();
        } catch (IOException ex) {
            Logger.getLogger(CurlSendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void sendSMS() throws IOException{
        process = Runtime.getRuntime().exec(command);
        
        try
    {
        process = processBuilder.start();
         BufferedReader reader =  new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ( (line = reader.readLine()) != null) {
                    builder.append(line);
                    builder.append(System.getProperty("line.separator"));
            }
            String result = builder.toString();
            System.out.print(result);

    }
    catch (IOException e)
    {   System.out.print("error");
        e.printStackTrace();
    }
    }
    
    
    
    
}
