package com.codingapi.banka.services;

import com.codingapi.banka.feign.BankBClient;
import com.codingapi.banka.model.Account;
import com.codingapi.banka.model.AccountDao;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BankServiceImpl implements BankService {

    @Autowired
    AccountDao accountDao;
    @Autowired
    BankBClient bankBClient;

    @LcnTransaction
    @Transactional
    public String start(int money){
        String user ="xiaoming";

        String result = bankBClient.addMoney(money,user);
        if("success".equals(result)){
            Account account = new Account();
            account.setUser(user);
            account.setMoney(money);
            int res =accountDao.update(account);
            throw  new RuntimeException("error runtime");
//            return res>0? "success":"error";
        }

        return null;
    }



    @Override
    public String addMoney(int money,String user) {
        boolean admire =false;
        Account account = new Account();
        account.setMoney(money);
        account.setUser(user);
        int getMoney = Integer.parseInt(accountDao.selectMoney(user));
//        System.out.println(getMoney);
        admire = (getMoney-money>0) ? true:false;
        if(admire){
            int result = accountDao.update(account);
            if(1==result){
                return "success";
            }else {
                return "error";
            }

        }else{
            return "more money is required";
        }
    }
}
