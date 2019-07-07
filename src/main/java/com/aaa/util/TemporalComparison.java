package com.aaa.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**      
 * 项目名称：AccumulationFund   
 * 类名称：TemporalComparison   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月22日 上午10:07:44       
 */

public class TemporalComparison {
	
	/**
	 * 传入的时间与当前时间进行比较
	 * @param d 传入的时间
	 * @return
	 */
	public static int getMonth(Date d) {
		// 转化时间格式,可以方便地修改日期格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		// now为当前时间
		Date now=new Date();
		// now1为当前时间格式化后的时间
		String now1=sdf.format(now);		
		try {
		    // 把String型的字符串转换成特定格式的date类型,
	        // parse()返回的是一个Date类型数据，format返回的是一个StringBuffer类型的数据
		    Date now2=sdf.parse(now1);
		    /* List list=new ArrayList<>(); */	
		    //进行年月的比较
			Calendar c1 = Calendar.getInstance();
		    Calendar c2 = Calendar.getInstance();
		    c1.setTime(now2);
		    c2.setTime(d);
		    //如果传入时间大于当前时间  （ c1 < c2 ）
		    if(c1.getTimeInMillis() < c2.getTimeInMillis()) return 0;
		    int year1 = c1.get(Calendar.YEAR);
		    int year2 = c2.get(Calendar.YEAR);
		    int month1 = c1.get(Calendar.MONTH);
		    int month2 = c2.get(Calendar.MONTH);
		    int day1 = c1.get(Calendar.DAY_OF_MONTH);
		    int day2 = c2.get(Calendar.DAY_OF_MONTH);
		    // 获取年的差值 假设 d1 = 2015-8-16 d2 = 2011-9-30
		    int yearInterval = year1 - year2;
		    // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
		    if(month1 < month2 || month1 == month2 && day1 < day2) yearInterval --;
		    // 获取月数差值
		    int monthInterval = (month1 + 12) - month2 ;
		    // if(day1 < day2) monthInterval --;
		    monthInterval %= 12;
		    // months为最终相差的月份
		    int months = yearInterval * 12 + monthInterval;
		    return months;
		    // System.out.println(months);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
}
