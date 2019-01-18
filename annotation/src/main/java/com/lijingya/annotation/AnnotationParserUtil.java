package com.lijingya.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author lijingya
 * @description 添加描述
 * @email lijingya@91118.com
 * @createDate 2019/1/18
 * @company 杭州天音
 */
public class AnnotationParserUtil {

    public static void getPrograminfo() {
        String clazz = "com.lijingya.annotation.Program";
        try {
            Class<?> c = Class.forName(clazz);
//            Class<?> c = AnnotationParserUtil.class.getClassLoader().loadClass(clazz);
            Field[] fields = c.getDeclaredFields();
            Method[] methods = c.getMethods();

            for (Field field : fields) {

                if (field.isAnnotationPresent(ProgramLanguage.class)) {
                    ProgramLanguage annotation = field.getAnnotation(ProgramLanguage.class);
                    System.out.println("名称：" + annotation.plgName() + "复杂度：" + annotation.complexity() + "学习周期：" + annotation.learningCycle());
                }
            }

            for (Method method : methods) {
                if (method.isAnnotationPresent(ProgramLanguage.class)) {
                    ProgramLanguage annotation = method.getAnnotation(ProgramLanguage.class);
                    System.out.println("名称：" + annotation.plgName() + "复杂度：" + annotation.complexity() + "学习周期：" + annotation.learningCycle());
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
