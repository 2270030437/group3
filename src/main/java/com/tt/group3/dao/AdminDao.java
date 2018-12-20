package com.tt.group3.dao;

import com.tt.group3.pojo.admin;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminDao {

    @Select("select * from admin where adminName=#{adminName} and adminPwd=#{adminPwd}")
    admin doLogin(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd);
    @Select("select * from buyer")
    List<buyer> getBuyer();
    @Select("select * from seller")
    List<seller> getSeller();
   //删除买家
    @Delete("delete from buyer where buyerId=#{buyerId}")
    void deleteBuyer(Integer buyerId);
}
