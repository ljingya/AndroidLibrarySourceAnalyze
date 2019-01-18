package com.lijingya.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lijingya
 * @description 添加描述
 * @email lijingya@91118.com
 * @createDate 2019/1/18
 * @company 杭州天音
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface ProgramLanguage {
    /**
     * 复杂度
     *
     * @return
     */
    int complexity() default 1;

    /**
     * 学习周期
     *
     * @return
     */
    String learningCycle() default "oneDay";

    /**
     * 枚举类
     */
    enum LgName {
        JAVA, ANDROID, IOS
    }


    LgName plgName() default LgName.JAVA;
}
