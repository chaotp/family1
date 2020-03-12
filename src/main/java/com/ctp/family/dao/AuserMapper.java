package com.ctp.family.dao;

import com.ctp.family.domain.Auser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AuserMapper {
    int deleteByPrimaryKey(@Param("id")  String id);

    int insert(Auser record);

    int insertSelective(Auser record);

    Auser selectByPrimaryKey(@Param("id")  String id);

    int updateByPrimaryKeySelective(Auser record);

    int updateByPrimaryKey(Auser record);
}