package com.condingapi.bankb.controller;


import com.condingapi.bankb.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    BankService bankServiceImpl;


    @GetMapping("/addMoney")
    public String getMoney(@RequestParam("money") int money,@RequestParam("user")String user){
        return bankServiceImpl.addMoney(money,user);
    }

}
