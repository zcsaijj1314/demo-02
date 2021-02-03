package com.example.demo02.dao;

import com.example.demo02.entity.Role;
import com.example.demo02.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User loadUserByUsername(@Param("username") String username);
    List<Role> getUserRolesById(@Param("id") int id);
}
