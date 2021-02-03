package com.example.demo02.entity;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private Integer id;
    private String pattern;  // url规则
    private List<Role> roles;
}
