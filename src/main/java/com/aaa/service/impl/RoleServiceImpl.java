package com.aaa.service.impl;

import com.aaa.dao.RoleDao;
import com.aaa.entity.PageResult;
import com.aaa.entity.Role;
import com.aaa.service.IRoleService;
import com.aaa.util.PageUtil;
import com.aaa.util.SystemConstant;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：RoleServiceImpl   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月2日 下午4:17:38       
 */
@Service
@Transactional//事务处理
public class RoleServiceImpl implements IRoleService {

	@Resource
	private RoleDao roleDao;
	/**
	 * 查询所有角色信息
	 * @return
	 */
	@Override
	public List<Map> selectRoleAll() {
		return roleDao.selectRoleAll();
	}
	
	/**
	 * 查询角色信息 (分页、模糊查询)
	 * @return
	 */
	@Override     
	public PageResult<Map> selectRole(Map map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//返回数据
		return PageUtil.selectResult(roleDao.getCount(map), roleDao.selectRole(map));
	}
	
	/**
	 * 添加新角色
	 * 并未新角色的菜单权限赋值（默认为空）
	 * @param r
	 * @return
	 */
	@Override
	public String addRole(Role r) {
		//添加新角色操作
		roleDao.addRole(r);
		//查询出来角色中id最大的一个，即为新添加的那一个
		Integer rid = roleDao.selectMaxRoleId();
		List<Integer> list = new ArrayList<>();
		//查询菜单的mid集合
		List<Integer> menuIds = roleDao.selectMenuIds(); 
		for (Integer mid : menuIds) {
			list.add(mid);
		}
		Map<String,Object> map = new HashMap<>();
		map.put("rid", rid);
		map.put("mids", list);
		//添加新角色在角色-菜单表中的对应
		return PageUtil.toResult(roleDao.addRoleMenu(map));
	}
	
	/**
	 * 修改新角色信息
	 * @param u
	 * @return
	 */
	@Override
	public String updateRole(Role r) {
		return PageUtil.toResult(roleDao.updateRole(r));
	}
	
	/**
	 * 修改角色状态
	 * 启用/禁用
	 * @param u
	 * @return
	 */
	@Override
	public String updateRoleState(Role r) {
		return PageUtil.toResult(roleDao.updateRoleState(r));
	}
	
	/**
	 * 为角色权限赋值
	 * （角色的菜单权限）
	 * @param map
	 * @return
	 */
	@Override
	public String accreditRole(Map map) {
		//获取二级菜单数组
		String mids = (String) map.get("mids");
		//获取需要修改的角色id,将其转化为Integer类型
		Integer rid = Integer.parseInt(map.get("rid").toString());
		map.put("rid", rid);
		//拆分菜单数组
		String[] midss = mids.split(",");
		//新建一个list<Integer>数组，用于存放mid集合
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < midss.length; i++) {
			Integer mid = Integer.parseInt(midss[i]);
			//将遍历出来的mid追加到list集合中去
			list.add(mid);
		}
		//查询出来二级菜单的一级菜单有哪些
		List<Integer> lists = roleDao.selectOneByTwos(list);
		for (int i = 0; i < lists.size(); i++) {
			list.add(lists.get(i));
		}
		list.add(1);
		//将集合添加进去
		map.put("mids", list);
		//修改所有被选中的菜单状态为1
		int i = roleDao.accreditRoleT(map);
		//修改所有未被选中的菜单状态为0
		int j = roleDao.accreditRoleF(map);
		return PageUtil.toResult(i);	
	}

	/**
	 * 查询角色名是否存在（唯一性验证）
	 * @param map
	 * @return
	 */
	@Override
	public String isExistRoleName(Map<String, Object> map) {
		Role role = roleDao.isExistRoleName(map);
		if (role==null) {
			//没有存在的名称
			return SystemConstant.SUCCESS;
		}
		return SystemConstant.FAIL;
	}

}
