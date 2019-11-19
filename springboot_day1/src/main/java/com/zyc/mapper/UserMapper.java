package com.zyc.mapper;

import com.zyc.bean.User;
import org.apache.ibatis.annotations.*;

import javax.jws.soap.SOAPBinding;

public interface UserMapper {

    @Insert("insert into user(name) value (#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    //保存对象，获取数据库自增id                数据库中的        类中的
    void add(User user);

    @Select("select id,name from user where id = #{id}")
    @Results({ //映射给类
            @Result(column = "name",property = "name")
    })
    User selectAll(Integer id);
}
