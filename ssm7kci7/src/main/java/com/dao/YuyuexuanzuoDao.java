package com.dao;

import com.entity.YuyuexuanzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuexuanzuoVO;
import com.entity.view.YuyuexuanzuoView;


/**
 * 预约选座
 * 
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public interface YuyuexuanzuoDao extends BaseMapper<YuyuexuanzuoEntity> {
	
	List<YuyuexuanzuoVO> selectListVO(@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);
	
	YuyuexuanzuoVO selectVO(@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);
	
	List<YuyuexuanzuoView> selectListView(@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);

	List<YuyuexuanzuoView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);
	
	YuyuexuanzuoView selectView(@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);



}
