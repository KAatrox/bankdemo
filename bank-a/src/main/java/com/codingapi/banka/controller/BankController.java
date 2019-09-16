package com.codingapi.banka.controller;

import com.codingapi.banka.feign.BankBClient;
import com.codingapi.banka.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    BankService bankServiceImpl;


    @GetMapping("/start")
    public String getMoney(@RequestParam("money") int money){
        return bankServiceImpl.start(money);
    }
}
