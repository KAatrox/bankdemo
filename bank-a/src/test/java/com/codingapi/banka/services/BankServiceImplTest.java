package com.codingapi.banka.services;

import com.codingapi.banka.BankAApplication;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.*;

public class BankServiceImplTest {



    @Before
    public void testBefore(){
        BankAApplication.main(new String[]{});
    }

    @Test
    public void addMoney() {

//        BankService bankServiceImpl= SpringContainer.getBean;
//        bankServiceImpl.addMoney(10,"xiaoming");
    }
}