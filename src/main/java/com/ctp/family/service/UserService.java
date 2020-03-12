package com.ctp.family.service;

import com.ctp.family.dao.AuserMapper;
import com.ctp.family.domain.Auser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * ClassName:16338
 * package:com.ctp.family.service
 * Description:TODO
 *
 * @date:2020/1/16 - 11:18
 * @Author:chaotianpeng
 */
@Service
public class UserService {
    @Autowired
    private AuserMapper auserMapper;
    //LoggerFactory.getLogger("asa");
    public Auser  qryUserById( String id){
        Auser auser = auserMapper.selectByPrimaryKey(id);
        return auser;
    }
    public String addAuser(Auser auser){
        int insert = auserMapper.insert(auser);
        if(insert != 1){
            System.out.println("新增出错！");
        }
        return "新增成功!";
    }
    public String upAuser(Auser auser){
        int i = auserMapper.updateByPrimaryKeySelective(auser);
        if(i != 1){
            System.out.println("更新出错！");
        }
        return "更新成功!";
    }
    public String delAuser(String id){
        int i = auserMapper.deleteByPrimaryKey(id);
        if(i != 1){
            System.out.println("删除出错！");
        }
        return "删除成功!";
    }

}
