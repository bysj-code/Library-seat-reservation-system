package com.dao;

import com.entity.QiantuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiantuixinxiVO;
import com.entity.view.QiantuixinxiView;


/**
 * 签退信息
 * 
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public interface QiantuixinxiDao extends BaseMapper<QiantuixinxiEntity> {
	
	List<QiantuixinxiVO> selectListVO(@Param("ew") Wrapper<QiantuixinxiEntity> wrapper);
	
	QiantuixinxiVO selectVO(@Param("ew") Wrapper<QiantuixinxiEntity> wrapper);
	
	List<QiantuixinxiView> selectListView(@Param("ew") Wrapper<QiantuixinxiEntity> wrapper);

	List<QiantuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiantuixinxiEntity> wrapper);
	
	QiantuixinxiView selectView(@Param("ew") Wrapper<QiantuixinxiEntity> wrapper);
	

}
