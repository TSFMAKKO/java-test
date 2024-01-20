package com.anotherexample;

import com.example.ClassA;  // 使用import关键字引入ClassA类

public class ClassB {
    public static void main(String[] args) {
        ClassA objA = new ClassA();  // 创建ClassA的实例
        objA.methodA();  // 调用ClassA的方法
    }
}
