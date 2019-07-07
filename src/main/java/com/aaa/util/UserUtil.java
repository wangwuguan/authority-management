package com.aaa.util;

import com.aaa.entity.Company;
import com.aaa.entity.Person;
import com.aaa.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 项目名称：AccumulationFund
 * 类名称：UserUtil
 * 类描述：存储登录人信息
 * 创建人：王鹏翔
 * 创建时间：2019年1月1日 下午4:19:27
 */
public class UserUtil {
	/**
     * 获取请求
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attrs.getRequest();
    }
	
	/**
	 * 获取session
	 * @return session
	 */
    private static HttpSession getSession() {
        HttpSession session = null;
        try {
            session = getRequest().getSession();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return session;	
    }
    
    /***
     * 存储当前登陆员工到 session中
     * @param emp
     */
    public static void SaveUser(User user){
    	getSession().setAttribute(SystemConstant.USER,user);
    }
    
    /**
     * 获取session中 当前登陆的员工对象
     * @param session
     * @return user
     */
    public static User getUser(){
    	return (User)getSession().getAttribute(SystemConstant.USER);
    }
   
    /**
     * 注销 销毁 管理人员session  
     */
    public static String removeUser() {
        HttpSession session = getSession();
        session.invalidate();
        return "redirect:../login/toBackLogin";
    }
    
    /**
     * 注销 销毁 前台人员session  
     */
    public static String removeFront() {
        HttpSession session = getSession();
        session.invalidate();
        return "redirect:../front/toFrontMain";
    }
    
    /***
     * 存储当前登陆的个人公积金账号信息到 session中
     * @param emp
     */
    public static void SavePerson(Person person){
    	getSession().setAttribute(SystemConstant.PERSON,person);
    }
    
    /**
     * 获取session中 当前登陆的个人公积金账号对象
     * @param session
     * @return user
     */
    public static Person getPerson(){
    	return (Person)getSession().getAttribute(SystemConstant.PERSON);
    }
    
    /***
     * 存储当前登陆的单位公积金账号信息到 session中
     * @param emp
     */
    public static void SaveCompany(Company company){
    	getSession().setAttribute(SystemConstant.COMPANY,company);
    }
    
    /**
     * 获取session中 当前登陆的单位公积金账号对象
     * @param session
     * @return user
     */
    public static Company getCompany(){
    	return (Company)getSession().getAttribute(SystemConstant.COMPANY);
    }
 
}
