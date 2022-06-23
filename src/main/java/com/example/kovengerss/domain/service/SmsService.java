package com.example.kovengerss.domain.service;

public interface SmsService {
    void sendMessage(String authCode, String userPhoneNum);
}
