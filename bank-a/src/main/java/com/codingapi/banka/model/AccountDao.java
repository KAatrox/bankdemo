package com.codingapi.banka.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountDao {

    @Update("update t_bank set money=money-#{money} where user=#{user}")
    int update(Account account);

    @Update("select money from t_bank where user=#{user}")
    String selectMoney(String user);
}
