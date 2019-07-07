package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.entity.Refund;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：RefundDao   
 * 类描述： 还款数据操作接口  
 * 创建人：陈延铠
 * 创建时间：2019年1月9日 下午8:50:05   
 *
 */
public interface RefundDao {
	/**
	 * 查询月还款信息数量
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ "select count(*) from refund r inner join person p on r.rpno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on r.rstateid=s.sid "
			+ " <where>"
			+ " rstateid =6 "
			+ " <if test=\" rno!=null and rno!='' \"> and rno like concat('%',#{rno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ " </where>"
			+ " </script> ")
	Integer everyRefundCount(Map<String, Object> map);
	/**
	 * 查询月还款信息
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ "select * from refund r inner join person p on r.rpno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on r.rstateid=s.sid "
			+ " <where>"
			+ " rstateid =6 "
			+ " <if test=\" rno!=null and rno!='' \"> and rno like concat('%',#{rno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ " </where>"
			+ " limit  #{page},#{limit} "
			+ " </script> ")
	List<Map> everyRefund(Map<String, Object> map);
	
	/**
	 * 还款操作
	 * @param refund
	 */
	@Update("<script>"
			+ "update refund <set> "
			+ " <if test=\" rstateid!=null and rstateid!='' \"> rstateid=#{rstateid}, </if>"
			+ "rhavemoney=#{rhavemoney},"
			+ "rhavecapital=#{rhavecapital},rcapital=#{rcapital},rdefaultinterest=#{rdefaultinterest}, "
			+ "rhaveinterest=#{rhaveinterest},rhaveperiods=#{rhaveperiods},"
			+ "rmoney=#{rmoney},rinterest=#{rinterest},rlasttime=now(),rtime=date_add(#{rtime}, interval 1 month) </set>"
			+ " where rpno=#{rpno} and rstateid=6 "
			+ "</script>")
	void monthRefund(Refund refund);
	
	/**
	 * 添加还款记录
	 * @param refund
	 * @param pname
	 */
	@Insert("insert into refund_history  values(null,#{rpno},#{pname},now(),#{rmoney},#{rcapital},#{rinterest},#{rhaveperiods}+1,#{rcreatetime},#{rdefaultinterest},#{rtime},#{hoperator})")
	void addHistory(Map map);
	
	/**
	 * 还款记录信息总数量
	 * @param map
	 * @return
	 */
	@Select("select count(*) from refund_history where hpno=#{hno} and hcreatetime=#{hcreatetime} ")
	Integer showHistoryCount(Map<String, Object> map);
	
	/**
	 * 还款记录信息
	 * @param map
	 * @return
	 */
	@Select("select * from refund_history where hpno=#{hno} and hcreatetime=#{hcreatetime}  limit #{page},#{limit}")
	List<Map> showHistory(Map<String, Object> map);
	
	/**
	 * 还款历史信息数量
	 * @return
	 */
	@Select("<script> "
			+ "select count(*) from refund r inner join person p on r.rpno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on r.rstateid=s.sid "
			+ " <where>"
			+ " rstateid =13 "
			+ " <if test=\" rno!=null and rno!='' \"> and rno like concat('%',#{rno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ " </where>"
			+ " </script> ")
	Integer selectRefundCount(Map map);
	
	/**
	 * 还款结清信息
	 * @return
	 */
	@Select("<script> "
			+ "select * from refund r inner join person p on r.rpno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on r.rstateid=s.sid "
			+ " <where>"
			+ " rstateid =13 "
			+ " <if test=\" rno!=null and rno!='' \"> and rno like concat('%',#{rno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(rcreatetime , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ " </where>"
			+ " limit  #{page},#{limit} "
			+ " </script> ")
	List<Map> selectRefund(Map map);
	
	/**
	 * 提前还款
	 * @param map
	 * @return
	 */
	@Update("update refund set rhavemoney=rhavemoney+#{rbeforehandmoney}, "
			+ " rhavecapital=rallmoney,rhaveinterest=rhaveinterest+#{rbefeorehandinterest}, "
			+ " rlasttime=now(),rhaveperiods=rhaveperiods+1,rstateid=13 "
			+ "where rpno=#{rpno} and rcreatetime=#{rcreatetime}")
	int befundhandRefund(Map<String, Object> map);
	
	/**
	 * 判断是否存在本月还款
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ "select count(*) from refund_history where hpno=#{hpno} and hdate=DATE_FORMAT(now(),'%Y-%m-%28') "
			+ "<![CDATA[   and DATE_FORMAT(hcreatetime , '%Y-%m-%d')>=  DATE_FORMAT(now(),'%Y-%m-%01')  ]]>"
			+ "<![CDATA[   and DATE_FORMAT(hcreatetime , '%Y-%m-%d')<=  DATE_FORMAT(now(),'%Y-%m-%28')  ]]>"
			+ " </script>")
	int selectHistory(Map<String, Object> map);
	
	/**
	 * 提前还款时添加纪录
	 * @param map
	 * @return
	 */
	@Insert("insert into refund_history  values(null,#{rpno},#{pname},now(),#{rbeforehandmoney},#{rbeforehandcapital},#{rbeforehandinterest},#{rhaveperiods}+1,#{rcreatetime},#{rdefaultinterest},#{rtime},#{hoperator})")
	int insertHistory(Map<String, Object> map);
 
}
