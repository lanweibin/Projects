package com.dynamic;

/**
 * @program: learn-demo
 * @description: 教师实现类
 * @author: LWB
 * @create: 2019-08-31 16:07
 **/
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教书");
    }
}
