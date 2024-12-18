package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiantuixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiantuixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiantuixinxiView;


/**
 * 签退信息
 *
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public interface QiantuixinxiService extends IService<QiantuixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiantuixinxiVO> selectListVO(Wrapper<QiantuixinxiEntity> wrapper);
   	
   	QiantuixinxiVO selectVO(@Param("ew") Wrapper<QiantuixinxiEntity> wrapper);
   	
   	List<QiantuixinxiView> selectListView(Wrapper<QiantuixinxiEntity> wrapper);
   	
   	QiantuixinxiView selectView(@Param("ew") Wrapper<QiantuixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiantuixinxiEntity> wrapper);
   	

}

