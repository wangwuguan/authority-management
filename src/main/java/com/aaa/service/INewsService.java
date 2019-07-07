package com.aaa.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.aaa.entity.News;
import com.aaa.entity.PageResult;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：INewsService   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月17日 下午8:47:55       
 */

public interface INewsService {

	/**
	 * @param map
	 * @return
	 */
	PageResult<Map> selectAllNews(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	String addNews(News news);

	/**
	 * @param news
	 * @return
	 */
	String updateNewsState(News news);

	/**
	 * @param news
	 * @return
	 */
	String delNews(News news);

	/**
	 * @param map
	 * @return
	 */
	PageResult<Map> selectNewsRecords(Map<String, Object> map);

	/**
	 * @param file
	 * @return
	 */
	Map upload(MultipartFile file, String filePath);

	/**
	 * @param news
	 * @return
	 */
	String updateNews(News news);
	
}
