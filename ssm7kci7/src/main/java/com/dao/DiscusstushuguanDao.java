package com.dao;

import com.entity.DiscusstushuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstushuguanVO;
import com.entity.view.DiscusstushuguanView;


/**
 * 图书馆评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-02 20:42:23
 */
public interface DiscusstushuguanDao extends BaseMapper<DiscusstushuguanEntity> {
	
	List<DiscusstushuguanVO> selectListVO(@Param("ew") Wrapper<DiscusstushuguanEntity> wrapper);
	
	DiscusstushuguanVO selectVO(@Param("ew") Wrapper<DiscusstushuguanEntity> wrapper);
	
	List<DiscusstushuguanView> selectListView(@Param("ew") Wrapper<DiscusstushuguanEntity> wrapper);

	List<DiscusstushuguanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstushuguanEntity> wrapper);
	
	DiscusstushuguanView selectView(@Param("ew") Wrapper<DiscusstushuguanEntity> wrapper);
	

}
