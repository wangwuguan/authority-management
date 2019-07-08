package com.aaa.service.impl;

import com.aaa.dao.NewsDao;
import com.aaa.entity.News;
import com.aaa.entity.PageResult;
import com.aaa.service.INewsService;
import com.aaa.util.FileUtil;
import com.aaa.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：NewsServiceImpl   
 * 类描述：前台信息管理
 * 创建人：will.Wang
 * 创建时间：2019年1月17日 下午8:49:11       
 */
@Service
public class NewsServiceImpl implements INewsService {

	@Autowired
	private NewsDao newsDao;
	
	/**
	 * 查询所有新闻（分页）
	 * @param map
	 * @return
	 */
	@Override
	public PageResult<Map> selectAllNews(Map<String, Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//返回数据
		return PageUtil.selectResult(newsDao.getNewsCount(map),newsDao.selectAllNews(map));
	}
	
	/**
	 * 添加新闻
	 * @param map
	 * @return
	 */
	@Override
	public String addNews(News news) {
		//判断是否有图片，没有的话加上默认图片
		if (news.getNsrc()==null) {
			news.setNsrc("http://localhost:8081/../../images/home_bg2.jpg");
		}
		//添加新闻
		newsDao.addNews(news);
		//添加新闻纪录
		return PageUtil.toResult(newsDao.addNewsRecords(news));
	}

	/**
	 * 发布新闻
	 * @param news
	 * @return
	 */
	@Override
	public String updateNewsState(News news) {
		//发布新闻
		newsDao.updateNewsState(news);
		//修改新闻记录
		return PageUtil.toResult(newsDao.updateNewsRecordState(news));
	}

	/**
	 * 删除新闻
	 * @param news
	 * @return
	 */
	@Override
	public String delNews(News news) {
		//删除新闻
		newsDao.delNews(news);
		//修改新闻记录
		return PageUtil.toResult(newsDao.updateNewsRecordStateTwo(news));
	}

	/**
	 * 查询新闻纪录表信息
	 * @param map
	 * @return
	 */
	@Override
	public PageResult<Map> selectNewsRecords(Map<String, Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//返回数据
		return PageUtil.selectResult(newsDao.getNewsRecordsCount(map),newsDao.selectNewsRecords(map));
	}

	/**
	 * 上传图片
	 * @param file
	 * @return
	 */
	@Override
	public Map upload(MultipartFile file,String filePath) {
		String upFile = null;
		if(file!=null&&!file.isEmpty()){
			//获取文件路径
			upFile = "http://localhost:8081/"+FileUtil.uploadFile(filePath, file);
			//获取上传文件的名字
			String fileName=file.getOriginalFilename();
		}
		 Map<String,Object> map = new HashMap<>();
		 map.put("code", 0);
		 map.put("msg", "");
		 map.put("data", upFile);
		 return map;
	}

	/**
	 * 修改新闻信息 
	 * @param news
	 * @return
	 */
	@Override
	public String updateNews(News news) {
		return PageUtil.toResult(newsDao.updateNews(news));
	}
}
