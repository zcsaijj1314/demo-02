package com.example.demo02.service;

import com.example.demo02.dao.MenuMapper;
import com.example.demo02.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;
    public List<Menu> getAllMenus(){
        return menuMapper.getAllMenus();
    }
}
