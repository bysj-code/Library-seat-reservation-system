package com.dao;

import com.entity.TushuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuguanVO;
import com.entity.view.TushuguanView;


/**
 * 图书馆
 * 
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public interface TushuguanDao extends BaseMapper<TushuguanEntity> {
	
	List<TushuguanVO> selectListVO(@Param("ew") Wrapper<TushuguanEntity> wrapper);
	
	TushuguanVO selectVO(@Param("ew") Wrapper<TushuguanEntity> wrapper);
	
	List<TushuguanView> selectListView(@Param("ew") Wrapper<TushuguanEntity> wrapper);

	List<TushuguanView> selectListView(Pagination page,@Param("ew") Wrapper<TushuguanEntity> wrapper);
	
	TushuguanView selectView(@Param("ew") Wrapper<TushuguanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<TushuguanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TushuguanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TushuguanEntity> wrapper);



}
