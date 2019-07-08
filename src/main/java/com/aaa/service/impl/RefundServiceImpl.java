package com.aaa.service.impl;

import com.aaa.dao.RefundDao;
import com.aaa.entity.PageResult;
import com.aaa.entity.Refund;
import com.aaa.entity.User;
import com.aaa.service.IRefundService;
import com.aaa.util.PageUtil;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;
/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：RefundServiceImpl   
 * 类描述： 还款业务层  
 * 创建人：
 * 创建时间：2019年1月9日 下午8:46:38   
 *
 */
@Service
@Transactional
public class RefundServiceImpl implements IRefundService {
	@Autowired
	private RefundDao refundDao;
	/**
	 * 月还款信息查询
	 */
	@Override
	public PageResult<Map> everyRefund(Map<String, Object> map) {
		PageUtil.pageMap(map);
		return 	PageUtil.selectResult(refundDao.everyRefundCount(map), refundDao.everyRefund(map));
	}
	
	/**
	 * 月还款操作
	 */
	@Override
	public void monthRefund(Map<String, Object> map) {
		Refund refund=new Refund();
		Double rallmoney=Double.parseDouble((String) map.get("rallmoney")) ; //贷款总金额
		Double rhavemoney=Double.parseDouble((String) map.get("rhavemoney")); //已还总贷款
		Double rmoney=Double.parseDouble((String) map.get("rmoney"));  //本月应还金额
		Double rhavecapital=Double.parseDouble((String) map.get("rhavecapital")); //已还本金
		Double rcapital=Double.parseDouble((String) map.get("rcapital"));//本月应还本金
		Double rhaveinterest=Double.parseDouble((String) map.get("rhaveinterest"));//已还利息
		Double rinterest=Double.parseDouble((String) map.get("rinterest"));//本月应还利息
		Double rrate=Double.parseDouble((String) map.get("rrate"));//利率
		Double rdefaultinterest = Double.parseDouble((String) map.get("rdefaultinterest"));
		Integer rallperiods=Integer.parseInt((String) map.get("rallperiods")) ;//总期数
		Integer rhaveperiods=Integer.parseInt((String) map.get("rhaveperiods"));//罚息
		String rtype=(String) map.get("rtype");//还款类型
		String rpno=(String) map.get("rpno");//账号
		Date rtime= java.sql.Date.valueOf((String) map.get("rtime")) ;//最迟还款日
		//判断是否为最后一期
		if(rhaveperiods==rallperiods-1){
			refund.setRstateid(SystemConstant.REFUND_OVER);//状态
			refund.setRhavecapital(rallmoney);//已还本金
		}else{
			//判断还款类型
			if(rtype.equals("等额本金")){
				rmoney= (rallmoney / rallperiods)+(rallmoney-rhavecapital-rcapital)*rrate*0.01/12;
				 rcapital=rallmoney/rallperiods;
				 rinterest=rmoney-rcapital;
				
			}else if(rtype.equals("等额本息")){
				 rmoney=(rallmoney*rrate*0.01/12*Math.pow((1+rrate/12*0.01),rallperiods))/(Math.pow((1+rrate/12*0.01),rallperiods)-1);	
				 rinterest=(rallmoney-rhavecapital-rcapital)*rrate*0.01/12;
				 rcapital=rmoney-rinterest;
			}
			refund.setRhavecapital(rhavecapital+rcapital);//已还本金
		}
		refund.setRhaveperiods(rhaveperiods+1);//已还期数
		refund.setRdefaultinterest(rdefaultinterest);//罚息
		refund.setRtime(rtime);//最迟还款日
		refund.setRtype(rtype);//还款类型
		refund.setRpno(rpno);//还款账号
		refund.setRmoney(rmoney);//本月要还金额
		refund.setRcapital(rcapital);//本月要还本金
		refund.setRinterest(rinterest);//本月要还利息
		refund.setRhavemoney(rhavemoney+rmoney+rdefaultinterest);//已还金额
		refund.setRhaveinterest(rhaveinterest+rinterest);//已还利息
		//获取登陆人
		User user = UserUtil.getUser();
		map.put("hoperator", user.getUname());
		refundDao.addHistory(map);//添加还款记录
		refundDao.monthRefund(refund);//月还款修改
		
	}
	
	/**
	 * 还款记录
	 */
	@Override
	public PageResult<Map> showHistory(Map<String,Object> map) {
		PageUtil.pageMap(map);
		return PageUtil.selectResult(refundDao.showHistoryCount(map),refundDao.showHistory(map) );
	}
	
	/**
	 * 还款结清页面信息
	 */
	@Override
	public PageResult<Map> selectRefund(Map<String, Object> map) {
		PageUtil.pageMap(map);
		return PageUtil.selectResult(refundDao.selectRefundCount(map), refundDao.selectRefund(map));
	}

	/**
	 * 提前还款操作
	 */
	@Override
	public int befundhandRefund(Map<String, Object> map) {
		User user = UserUtil.getUser();
		map.put("hoperator", user.getUname());
		refundDao.insertHistory(map);
		return refundDao.befundhandRefund(map);
	}
	
	/**
	 * 提前还款判断本月是否还过款
	 */
	@Override
	public int selectHistory(Map<String, Object> map) {
		return refundDao.selectHistory(map);
	}
	
	
}
