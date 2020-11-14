/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

import java.io.IOException;
import java.util.Date;
import java.util.ResourceBundle;
import org.jsmpp.InvalidResponseException;
import org.jsmpp.PDUException;
import org.jsmpp.bean.Alphabet;
import org.jsmpp.bean.BindType;
import org.jsmpp.bean.ESMClass;
import org.jsmpp.bean.GeneralDataCoding;
import org.jsmpp.bean.MessageClass;
import org.jsmpp.bean.NumberingPlanIndicator;
import org.jsmpp.bean.RegisteredDelivery;
import org.jsmpp.bean.SMSCDeliveryReceipt;
import org.jsmpp.bean.TypeOfNumber;
import org.jsmpp.extra.NegativeResponseException;
import org.jsmpp.extra.ResponseTimeoutException;
import org.jsmpp.session.BindParameter;
import org.jsmpp.session.SMPPSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSService {
    //private static final Logger LOGGER = LoggerFactory.getLogger(SimpleSubmitExample.class);
    
    public static void main(String[] args) {
        SMPPSession session = new SMPPSession();
        try {
            //LOGGER.info("Connecting");
            String systemId = session.connectAndBind("smscsim.melroselabs.com", 2775, new BindParameter(BindType.BIND_TX, "701835", "GEOFDQ", "", TypeOfNumber.UNKNOWN, NumberingPlanIndicator.UNKNOWN, null));
            
            try {
                String messageId = session.submitShortMessage("",
                    TypeOfNumber.UNKNOWN, NumberingPlanIndicator.UNKNOWN, "MelroseLabs",
                    TypeOfNumber.INTERNATIONAL, NumberingPlanIndicator.UNKNOWN, "254763404086",
                    new ESMClass(), (byte)0, (byte)1,  new Date().toString(), null,
                    new RegisteredDelivery(SMSCDeliveryReceipt.DEFAULT), (byte)0, new GeneralDataCoding(Alphabet.ALPHA_DEFAULT, MessageClass.CLASS1, false), (byte)0,
                    "Hello World".getBytes());
                    LOGGER.info("Message successfully submitted (message_id={})"+messageId);
            } catch (PDUException e) {
                // Invalid PDU parameter
               LOGGER.info("Invalid PDU parameter"+e);
            } catch (ResponseTimeoutException e) {
                // Response timeout
                LOGGER.info("Response timeout"+e);
            } catch (InvalidResponseException e) {
                // Invalid response
                LOGGER.info("Receive invalid response"+e);
            } catch (NegativeResponseException e) {
                // Receiving negative response (non-zero command_status)
                LOGGER.info("Receive negative response"+e);
            } catch (IOException e) {
                LOGGER.info("IO error occured"+e);
            }

            session.unbindAndClose();

        } catch (IOException e) {
            LOGGER.info("Failed connect and bind to SMSC"+e);
        }
    }
}
