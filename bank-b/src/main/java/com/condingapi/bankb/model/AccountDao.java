package com.condingapi.bankb.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountDao {

    @Update("update t_bank set money=money+#{money} where user=#{user}")
    int update(Account account);

}
