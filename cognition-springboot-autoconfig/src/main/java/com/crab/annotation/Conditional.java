package com.crab.annotation;

import com.crab.annotation.inter.Condition;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public
@interface Conditional {
    /**
     * 传入一个实现Condition接口的类
     */
    Class<? extends Condition>[] value();
}

