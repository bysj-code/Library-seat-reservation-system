package com.dao;

import com.entity.ZuoweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweixinxiVO;
import com.entity.view.ZuoweixinxiView;


/**
 * 座位信息
 * 
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public interface ZuoweixinxiDao extends BaseMapper<ZuoweixinxiEntity> {
	
	List<ZuoweixinxiVO> selectListVO(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	
	ZuoweixinxiVO selectVO(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	
	List<ZuoweixinxiView> selectListView(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);

	List<ZuoweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	
	ZuoweixinxiView selectView(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);



}
