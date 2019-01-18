package com.lijingya.annotation;

import com.lijingya.annotation.ProgramLanguage.LgName;

/**
 * @author lijingya
 * @description 添加描述
 * @email lijingya@91118.com
 * @createDate 2019/1/18
 * @company 杭州天音
 */
public class Program {

    @ProgramLanguage(plgName = LgName.ANDROID)
    private String name;

    @ProgramLanguage(complexity = 10)
    private int complexity;

    @ProgramLanguage(learningCycle = "tenDay")
    private String learningCycle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public String getLearningCycle() {
        return learningCycle;
    }

    public void setLearningCycle(String learningCycle) {
        this.learningCycle = learningCycle;
    }

    @ProgramLanguage(plgName = LgName.IOS, complexity = 2, learningCycle = "threeDay")
    public void getProgram() {
        System.out.println("method：getProgram");
    }
}
