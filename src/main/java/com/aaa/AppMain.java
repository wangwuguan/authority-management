package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：AppMain   
 * 类描述： 项目的启动类  
 * 创建人：王鹏翔  
 * 创建时间：2018年12月28日 上午9:37:00
 * 
 */
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@SpringBootApplication
@MapperScan("com.aaa.dao")
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class,args);
    }
     
}
