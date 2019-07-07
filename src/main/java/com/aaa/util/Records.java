package com.aaa.util;

import com.aaa.dao.InformationDao;
import com.aaa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：AuditRecords   
 * 类描述：日志记录工具类   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月9日 下午8:28:36       
 */
@Component // 需要添加Component注释才会被springboot管理
public class Records {

	public static Records records; // 2.添加一个该类的静态对象作为属性
	
	@Autowired
	private InformationDao inDao;

	/**
	 * 3. 使用@PostConstruct方法引导绑定
 	 */
    @PostConstruct
    public void init() {
    	records = this;
    	records.inDao = this.inDao;
    }

    /**
	 * 生成单位公积金信息日志表
	 * @param map map{cid="",rcmsg=""} cid必须要有，为单位表id;rcmsg为备注信息，可以没有，默认为“无”
	 * @param state 操作类型
	 * @return
	 */
	public static String createCompanyCrecords(Map map,Integer state) {
		//获取当前登录人信息
		User user = UserUtil.getUser();
		map.put("user", user);
		//日志：基本信息修改 
		map.put("rctid", state);
		//生成单位信息修改变更记录
		return PageUtil.toResult(records.inDao.addCompanyChangeRecords(map));
	}
	
	/**
	 * 生成单位公积金信息日志表(添加if判断)
	 * @param map map{cid="",rcmsg=""} cid必须要有，为单位表id;rcmsg为备注信息，可以没有，默认为“无”
	 * @param state 操作类型
	 * @return
	 */
	public static String createCompanyCrecords(Integer i,Map map,Integer state) {
		if (i > 0) {
			//获取当前登录人信息
			User user = UserUtil.getUser();
			map.put("user", user);
			//日志：基本信息修改 
			map.put("rctid", state);
			//生成单位信息修改变更记录
			return PageUtil.toResult(records.inDao.addCompanyChangeRecords(map));
		}
		return SystemConstant.FAIL;
	}
	
	/**
	 * 生成个人公积金信息日志表
	 * @param map map{pid="",rpmsg=""} pid必须要有，为个人表id;rpmsg为备注信息，可以没有，默认为“无”
	 * @param state 操作类型
	 * @return
	 */
	public static String createPersonCrecords(Map map,Integer state) {
		//获取当前登录人信息
		User user = UserUtil.getUser();
		map.put("user", user);
		//日志：基本信息修改 
		map.put("rptid", state);
		//生成单位信息修改变更记录
		return PageUtil.toResult(records.inDao.addPersonChangeRecords(map));
	}
	
	/**
	 * 生成个人公积金信息日志表(添加if判断)
	 * @param map map{pid="",rpmsg=""} pid必须要有，为个人表id;rpmsg为备注信息，可以没有，默认为“无”
	 * @param state 操作类型
	 * @return
	 */
	public static String createPersonCrecords(Integer i,Map map,Integer state) {
		if (i > 0) {
			//获取当前登录人信息
			User user = UserUtil.getUser();
			map.put("user", user);
			//日志：基本信息修改 
			map.put("rptid", state);
			//生成单位信息修改变更记录
			return PageUtil.toResult(records.inDao.addPersonChangeRecords(map));
		}
		return SystemConstant.FAIL;
	}
	
}
