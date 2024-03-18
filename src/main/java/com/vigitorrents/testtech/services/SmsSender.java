package com.vigitorrents.testtech.services;

import org.springframework.stereotype.Service;
import pl.smsapi.OAuthClient;
import pl.smsapi.api.SmsFactory;
import pl.smsapi.api.response.SendStatusResponse;
import pl.smsapi.exception.SmsapiException;

@Service
public class SmsSender {

    public SendStatusResponse send(String mobileNumber, String message, String accessToken) throws SmsapiException {
        var client = new OAuthClient(accessToken);
        var smsFactory = new SmsFactory(client);
        var actionSmsSend = smsFactory.actionSend(mobileNumber, message);
        System.out.println("entering SmsSender.send()");
        System.out.println(" mobileNumber = "+mobileNumber);
        System.out.println(" message = "+message);
        var result = actionSmsSend.execute();
        System.out.println("exiting SmsSender.send()");
        return result;
    }
}
