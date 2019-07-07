package com.aaa.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaa.dao.RemitDao;
import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.User;
import com.aaa.service.IRemitService;
import com.aaa.util.PageUtil;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;
@Service
public class RemitServiceImpl implements IRemitService{
	
	@Autowired
	private RemitDao reDao;

	@Override
	public PageResult<Map> selectCompanyInfo(Map<String, Object> map) {
		PageUtil.pageMap(map);
		return PageUtil.selectResult(reDao.getCount(map),reDao.selectCompanyInfo(map));
	}

	@Override
	public String updateCbalanc(Map<String,Object> map) {
		int i = reDao.updateCbalanc(map);
		return PageUtil.toResult(i);
	}
	
    /**
    * 汇缴办理 （判断）            
    * 1. 判断本月是否已汇缴
    * 2. 如果汇缴年月为空 可以汇缴
    * 3. 判断是不是有需要补缴的人员
    * 4. 判断账号余额够不够                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    * @param map
    * @return
    */
	@Override
	public String updateShowRemit(Map<String,Object> map) {
		//查询公司旗下的员工信息
		reDao.selectCompanyInfo(map);
		return null;
	}
	
	/**
	 * 汇缴操作
	 * @param map
	 * @return
	 */
	private String updateRemit(Map<String,Object> map) {
		int i=reDao.updateShowRemit(map);
		int j=reDao.updatePersonRemit(map);
		return companyDetail(map,SystemConstant.REMIT);
	}

	@Override
	public PageResult<Map> selectCompanyPayment(Map<String, Object> map) {
		PageUtil.pageMap(map);
		return PageUtil.selectResult(reDao.getCount(map),reDao.selectCompanyPayment(map));
	}
	
	public String companyDetail(Map<String,Object> map,String operation){
		//获取账户余额
		map.put("cdcount", reDao.selectCbalanc(map));
		//获取操作人信息
		User user=UserUtil.getUser();
		map.put("user", user);
		map.put("cdtype", operation);
		return PageUtil.toResult(reDao.insertCompanyDerail(map));
	}

	@Override
	public PageResult<Map> selectCompanyDetail(Map<String, Object> map) {
		PageUtil.pageMap(map);
		return PageUtil.selectResult(reDao.getCounts(map),reDao.selectCompanyDetail(map));
	}

	@Override
	public String updateShowPayment(Map<String, Object> map) {
	
		int i=reDao.updateShowRemit(map);
		int j=reDao.updatePersonRemit(map);
		String renshu=map.get("needremit").toString();
		map.put("renshu", renshu);
		System.out.println(map);
		companyDetail(map,SystemConstant.PAYMENT);
		return PageUtil.toResult(i);
	}
	
	
}
	
	/*public Map findComBy(Map map) {
		Map maps=(Map) reDao.selectCompanyInfo(map);
		Date ss = new Date();
		SimpleDateFormat aa  = new SimpleDateFormat("yyyy-MM-dd");
		String today = aa.format(ss);
		maps.put("position",today);
		int remitmonths = 1;//汇缴月数
		maps.put("remitmonths", remitmonths);
		if(maps!=null&&maps.size()>0){			
			if( maps.get("uapayenddate")==null || maps.get("uapayenddate")=="" ){
				 maps.put("issc", false);
				 return maps;
		}else{
			 String ot =maps.get("uapayenddate")+"";
			 String oldTime =  ot.replace("-", "").substring(0,6);
			 //获取当前时间
			 Date date = new Date();
			 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
			 String df = dateFormat.format9(date);
			 String nt = df.toString();
			 if(oldTime.equals(nt)){
				 maps.put("issc", true);
				 maps.put("info", "本月已汇缴");
			 }else{
				 maps.put("issc", false);
			 }
		 }
		return maps;
		}
		return maps;
	}*/
	
	

