package com.aaa.controller;

import com.aaa.entity.News;
import com.aaa.entity.PageResult;
import com.aaa.service.INewsService;
import com.aaa.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：NewsController   
 * 类描述：   
 * 创建人：will.Wang
 * 创建时间：2019年1月17日 下午8:47:22       
 */
@Controller
@RequestMapping("news")
public class NewsController {

	@Autowired
	private INewsService newsService;
	
	@Value("${upload.path}")
	private String filePath;
	
	/**
	 * 上传图片
	 * @param file
	 * @return
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public Map upload(@RequestParam("file") MultipartFile file){
		return newsService.upload(file,filePath);
	}
   
	/**
     * 下载
     * @param fileName 文件名
     * @param response
     */
    @RequestMapping("/downLoad")
    public void downFile(String fileName, HttpServletResponse response){
        FileUtil.downloadFile(filePath,fileName,response);
    }
	
	/**
	 * 跳转到后台新闻查看页面
	 * @return
	 */
	@RequestMapping("toShowNews")
	public String toShowNews() {
		return "news/showNews";
	}
	
	/**
	 * 查询所有新闻
	 * @param map
	 * @return
	 */
	@RequestMapping("selectAllNews")
	@ResponseBody
	public PageResult<Map> selectAllNews(@RequestParam Map<String,Object> map) {
		return newsService.selectAllNews(map);
	}
	
	/**
	 * 查询所有新闻记录
	 * @param map
	 * @return
	 */
	@RequestMapping("selectNewsRecords")
	@ResponseBody
	public PageResult<Map> selectNewsRecords(@RequestParam Map<String,Object> map) {
		return newsService.selectNewsRecords(map);
	}
	
	/**
	 * 跳转到新闻添加页面
	 * @return
	 */
	@RequestMapping("toAddNews")
	public String toAddNews() {
		return "news/addNews";
	}
	
	/**
	 * 添加新闻
	 * @return
	 */
	@RequestMapping("addNews")
	@ResponseBody
	public String addNews(News news) {
		return newsService.addNews(news);
	}
	
	/**
	 * 发布新闻
	 * @return
	 */
	@RequestMapping("updateNewsState")
	@ResponseBody
	public String updateNewsState(News news) {
		return newsService.updateNewsState(news);
	}
	
	/**
	 * 删除新闻
	 * @return
	 */
	@RequestMapping("delNews")
	@ResponseBody
	public String delNews(News news) {
		return newsService.delNews(news);
	}
	
	/**
	 * 跳转到新闻记录查看页面
	 * @return
	 */
	@RequestMapping("toNewsRecords")
	public String toAddNewsRecords() {
		return "news/newsRecords";
	}
	
	/**
	 * 修改新闻信息
	 * @return
	 */
	@RequestMapping("updateNews")
	@ResponseBody
	public String updateNews(News news) {
		return newsService.updateNews(news);
	}
	
}
