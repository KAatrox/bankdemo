package com.codingapi.banka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "bank-b")
public interface BankBClient {
    @GetMapping("/addMoney")
    String addMoney(@RequestParam("money") int money, @RequestParam("user")String user);
}
