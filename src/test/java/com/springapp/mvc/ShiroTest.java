package com.springapp.mvc;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.*;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cloudsher on 2016/4/26.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class ShiroTest {

    private Subject subject;

    @Test
    public void test(){
        UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");

        subject.login(token);

        Assert.assertEquals(true,subject.isAuthenticated());

        subject.logout();
    }

    @Before
    public void common(){
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        org.apache.shiro.mgt.SecurityManager instance = factory.getInstance();

        SecurityUtils.setSecurityManager(instance);

        subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");

        subject.login(token);

        Assert.assertEquals(true,subject.isAuthenticated());
    }

    @Test
    public void test_role(){
        Assert.assertTrue(subject.hasRole("role1"));

        boolean []b = subject.hasRoles(Arrays.asList("role2", "role1"));
        Assert.assertTrue(b[0]);
        Assert.assertEquals(true,b[1]);
    }


    @Test
    public void test_authority(){
        Assert.assertTrue(subject.isPermitted("create"));
    }
}
