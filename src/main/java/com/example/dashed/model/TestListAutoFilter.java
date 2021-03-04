package com.example.dashed.model;

import xyz.erupt.annotation.fun.FilterHandler;

import java.util.Arrays;

public class TestListAutoFilter implements FilterHandler {
    @Override
    public String filter(String condition, String[] params) {
        System.out.println("输出 TestListAutoFilter");
        System.out.println(Arrays.toString(params));
        return condition;
    }
}
