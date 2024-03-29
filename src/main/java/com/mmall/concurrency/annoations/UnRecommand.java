package com.mmall.concurrency.annoations;

//新增注解

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*
标记不推荐的类或者写法
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface UnRecommand {
    String value() default "";
}
