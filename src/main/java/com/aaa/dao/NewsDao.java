package com.aaa.dao;

import com.aaa.entity.News;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：NewsDao   
 * 类描述：   
 * 创建人：will.Wang
 * 创建时间：2019年1月17日 下午8:47:39       
 */

public interface NewsDao {

	/**
	 * @return
	 */
	List<Map> selectAllNews(Map<String, Object> map);
	
	/**
	 * @return
	 */
	Integer getNewsCount(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	Integer addNews(News news);

	/**
	 * @param news
	 * @return
	 */
	Integer addNewsRecords(News news);

	/**
	 * @param news
	 * @return
	 */
	Integer updateNewsState(News news);

	/**
	 * @param news
	 * @return
	 */
	Integer delNews(News news);

	/**
	 * @param map
	 * @return
	 */
	Integer getNewsRecordsCount(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	List<Map> selectNewsRecords(Map<String, Object> map);

	/**
	 * @param news
	 * @return
	 */
	Integer updateNewsRecordState(News news);
	
	/**
	 * @param news
	 * @return
	 */
	Integer updateNewsRecordStateTwo(News news);

	/**
	 * @param news
	 * @return
	 */
	int updateNews(News news);
	
}
