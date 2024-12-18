package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuexuanzuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuexuanzuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuexuanzuoView;


/**
 * 预约选座
 *
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public interface YuyuexuanzuoService extends IService<YuyuexuanzuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuexuanzuoVO> selectListVO(Wrapper<YuyuexuanzuoEntity> wrapper);
   	
   	YuyuexuanzuoVO selectVO(@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);
   	
   	List<YuyuexuanzuoView> selectListView(Wrapper<YuyuexuanzuoEntity> wrapper);
   	
   	YuyuexuanzuoView selectView(@Param("ew") Wrapper<YuyuexuanzuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuexuanzuoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuyuexuanzuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuyuexuanzuoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuyuexuanzuoEntity> wrapper);



}

