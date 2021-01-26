/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WOCHIENG1
 */
public class HttpSendSMS {

    URL url;
    HttpURLConnection con;

    //method to send SMS
    public void sendSMS() {
        try {
            // create url
            url = new URL("https://dtsvc.safaricom.com:8480/api/public/CMS/bulksms");
            con = (HttpURLConnection) url.openConnection();

            //set the request method "POST"
            con.setRequestMethod("POST");
            //sent content type header
            con.setRequestProperty("Content-Type", "application/json; utf-8");

            //add authorization header
            con.setRequestProperty("X-Authorization", "Bearer " + "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ3eWJvc29mdF9hcGl1c2VyIiwiYXVkIjoiQUNDRVNTIiwic2NvcGVzIjoiQURNSU4iLCJpc3MiOiJodHRwOi8vc2l4ZGVlLmNvbSIsImlhdCI6MTYxMTY1MjAxNSwiZXhwIjoxNjExNjYxMDE1fQ.icJfpVbTUmAMRcndbaexogFGIaPsOjylaTZ8WwTxMcyfFg2Xsx3souqotGQG2suyGygHSB1DGdXyA4KkWJ1G6A");

            //set response format
            con.setRequestProperty("Accept", "application/json");

            //enable writing content to output stream
            con.setDoOutput(true);

            //create request body
            String smsJSONString = "{\"timeStamp\":\"1556873649895\",\"dataSet\":[{\"oa\":\"TestSDP\",\"channel\":\"sms\",\"userName\":\"wycliffe\",\"msisdn\":\"254715404086\",\"message\":\"Wycliffe test SMS\",\"uniqueId\":\"jib123456777778\",\"actionResponseURL\":\"https://posthere.io/f815-46bc-b480\"}]}";

            //Write to OutputStream
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = smsJSONString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(HttpSendSMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException io) {
            io.printStackTrace();
        }

    }

    public static void main(String... vargs) {
        //create object to access non static method
        HttpSendSMS httpssms = new HttpSendSMS();
        httpssms.sendSMS();
    }

}
