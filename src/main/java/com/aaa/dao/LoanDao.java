package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.aaa.entity.Loan;
import com.aaa.entity.Refund;

public interface LoanDao {
	/**
	 * 从个人信息表中查询信息
	 * @param loan
	 * @return
	 */
	@Select("select p.*,c.cno cno,c.cname cname,c.cphone cphone,ps.pstate sname from person p"
			+ " inner join company c on p.acid=c.cid "
			+ " inner join person_state ps on p.pstateid=ps.pstateid "
			+ "where pno=#{personno}")
	Map getPerson(Loan loan);
	
	/**
	 * 个人贷款添加
	 * @param loan
	 */
	@Insert("insert into loan (personno,lno,lsalay,ldeposit,lmoney,lperiods,lction,"
			+ "lname,lrate,lrefundtype,lopenbank,lpayment,lcardno,"
			+ "lunderwriterno,lhousetype,laddress,lallarea,lhouseno,"
			+ "lbuyname,lbuycardno,lhouseprice,lfirstpay,lareaprice,"
			+ "lcollateraltype,lcollateralname,lcollateralnumber,lcollateraladdress,"
			+ "lcollateralstate,lcollateralacount,lapplydate) "
			+ " values(#{personno},#{lno},#{lsalay},#{ldeposit},#{lmoney},#{lperiods},#{lction},"
			+ "#{lname},#{lrate},#{lrefundtype},#{lopenbank},#{lpayment},#{lcardno},"
			+ "#{lunderwriterno},#{lhousetype},#{laddress},#{lallarea},#{lhouseno},"
			+ "#{lbuyname},#{lbuycardno},#{lhouseprice},#{lfirstpay},#{lareaprice},"
			+ "#{lcollateraltype},#{lcollateralname},#{lcollateralnumber},#{lcollateraladdress},"
			+ "#{lcollateralstate},#{lcollateralacount},now())")
	void addLoan(Loan loan);
	
	/**
	 * 查询全部初审贷款信息
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ "select *,s.sname sname,pstate from loan l inner join person p on l.personno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on l.lstateid=s.sid "
			+ " inner join person_state ps  on p.remitstate=ps.pstateid "
			+ " <where>"
			+ " lstateid =1 "
			+ " <if test=\" lno!=null and lno!='' \"> and lno like concat('%',#{lno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ " </where>"
			+ " limit  #{page},#{limit} "
			+ " </script> ")
	List<Map> selectLoan(Map map);
	
	/**
	 * 查询全部贷款初审信息的总数量
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ "select count(*) from loan l inner join person p on l.personno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on l.lstateid=s.sid "
			+ " inner join person_state ps on p.remitstate=ps.pstateid "
			+ " <where>  lstateid =1 "
			+ " <if test=\" lno!=null and lno!='' \">and lno like concat('%',#{lno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ " </where>"
			+ " </script> ")
	int selectLoanCount(Map map);
	
	/**
	 * 初审通过操作
	 * @param loan
	 */
	@Update("update loan set lstateid=4 where personno=#{personno} and lstateid in (1,7) ")
	int firstPass(Loan loan);
	
	/**
	 * 初审驳回操作
	 * @param loan
	 */
	@Update("update loan set lstateid=3,lrejecttext=#{lrejecttext} where personno=#{personno} and lstateid in (1,7)")
	int firstReject(Loan loan);
	
	/**
	 * 复审信息总数量
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ " select count(*) from loan l inner join person p on l.personno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on l.lstateid=s.sid "
			+ " inner join person_state ps on p.remitstate=ps.pstateid "
			+ " <where> "
			+ " lstateid=4 "
			+ "<if test=\" lno!=null and lno!='' \"> and lno like concat('%',#{lno}) </if> "
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ "</where>"
			+ " </script> ")
	int selectLastCheckCount(Map<String, Object> map);
	
	/**
	 * 贷款复审信息
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ "select * from loan l inner join person p on l.personno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on l.lstateid=s.sid "
			+ " inner join person_state ps  on p.remitstate=ps.pstateid "
			+ " <where> "
			+ " lstateid=4 "
			+ " <if test=\" lno!=null and lno!='' \"> and lno like concat('%',#{lno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ "</where>"
			+ " limit  #{page},#{limit} "
			+ " </script> ")
	List<Map> selectLastCheck(Map<String, Object> map);
	
	/**
	 * 复审通过
	 * @param loan
	 * @return
	 */
	@Update("update loan set lstateid=5 where personno=#{personno} and lstateid=4")
	int lastPass(Loan loan);
	
	/**
	 * 复审驳回
	 * @param loan
	 * @return
	 */
	@Update("update loan set lstateid=7,lrejecttext=#{lrejecttext} where personno=#{personno} and lstateid=4")
	int lastReject(Loan loan);
	
	/**
	 * 通过前查询贷款表
	 * @param loan
	 * @return
	 */
	@Select("select * from loan where personno=#{personno} and lstateid=4")
	Loan getLoan(Loan loan);
	
	/**
	 * 添加还款表信息
	 * @param refund
	 */
	@Insert("insert into refund (rtime,rtype,rno,rpno,rcreatetime,rallmoney,rallperiods,rrate,rmoney,rcapital,rinterest)  "
			+ " values(date_add(curdate() - day(curdate()) +28, interval 1 month),#{rtype},#{rno},"
			+ "#{rpno},now(),#{rallmoney},#{rallperiods},#{rrate},#{rmoney},#{rcapital},#{rinterest})  ")
	void addRefund(Refund refund);
	
	/**
	 * 贷款总记录数量查询
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ " select count(*) from loan l inner join person p on l.personno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on l.lstateid=s.sid "
			+ " <where> "
			+ " <if test=\" lno!=null and lno!='' \"> and lno like concat('%',#{lno}) </if> "
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ "</where>"
			+ " </script> ")
	int showLoanCount(Map<String, Object> map);

	/**
	 * 	  贷款总记录查询
	 * @param map
	 * @return
	 */
	@Select("<script> "
			+ "select * from loan l inner join person p on l.personno=p.pno "
			+ " inner join company c on p.acid=c.cid "
			+ " inner join state s on l.lstateid=s.sid "
			+ " <where>"
			+ " <if test=\" lno!=null and lno!='' \"> and lno like concat('%',#{lno}) </if>"
			+ " <if test=\" pname!=null and pname!='' \"> and pname like concat('%',#{pname},'%') </if> "
			+ " <if test=\" starttime!=null and starttime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')>=  DATE_FORMAT(#{starttime}, '%Y-%m-%d')  ]]> </if> "
			+ " <if test=\" endtime!=null and endtime !='' \"><![CDATA[   and DATE_FORMAT(lapplydate , '%Y-%m-%d')<=  DATE_FORMAT(#{endtime}, '%Y-%m-%d')  ]]></if> "
			+ "</where>"
			+ " limit  #{page},#{limit} "
			+ " </script> ")
	List<Map> showLoan(Map<String, Object> map);
	
	/**
	 * 查询所有银行
	 * @return
	 */
	@Select("select * from bank ")
	List<Map> selectBank();

	/**
	 * 选择期数
	 * @return
	 */
	@Select("select * from loan_periods")
	List<Map> selectPeriods();
	
	/**
	 * 获取pid
	 * @param loan
	 * @return
	 */
	@Select("select pid from person where pno=#{personno}")
	int selectPersonId(Loan loan);


}
