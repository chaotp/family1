package com.ctp.family.dao;

import com.ctp.family.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * ClassName:16338
 * package:com.ctp.family.dao
 * Description:TODO
 *
 * @date:2020/1/16 - 11:15
 * @Author:chaotianpeng
 */
@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
   User qryUserById(@Param("id") String id);
}

