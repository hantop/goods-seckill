package com.miaosha.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 访问控制注解
 *
 * 控制方法的访问次数
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AccessLimit {

    int seconds() default 1;
    int maxCount() default 1;
    boolean needLogin() default false;
}
