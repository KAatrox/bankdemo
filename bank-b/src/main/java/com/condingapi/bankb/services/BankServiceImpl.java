package com.condingapi.bankb.services;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.condingapi.bankb.model.Account;
import com.condingapi.bankb.model.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BankServiceImpl implements BankService {

    @Autowired
    AccountDao accountDao;

    public String start(int money){


        return null;
    }



    @Override
    @LcnTransaction
    @Transactional
    public String addMoney(int money,String user) {

        Account account = new Account();
        account.setMoney(money);
        account.setUser(user);
//        System.out.println(getMoney);

        int result = accountDao.update(account);
        if(1==result){
            return "success";
        }else {
            return "error";
        }
    }
}
