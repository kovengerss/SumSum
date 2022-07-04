
package com.example.kovengerss.domain.service;

public interface SmsSignService {
    void sendCode(String userPhoneNum, int randomNumber);
}

