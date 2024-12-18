package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuyuexuanzuoDao;
import com.entity.YuyuexuanzuoEntity;
import com.service.YuyuexuanzuoService;
import com.entity.vo.YuyuexuanzuoVO;
import com.entity.view.YuyuexuanzuoView;

@Service("yuyuexuanzuoService")
public class YuyuexuanzuoServiceImpl extends ServiceImpl<YuyuexuanzuoDao, YuyuexuanzuoEntity> implements YuyuexuanzuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuexuanzuoEntity> page = this.selectPage(
                new Query<YuyuexuanzuoEntity>(params).getPage(),
                new EntityWrapper<YuyuexuanzuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuexuanzuoEntity> wrapper) {
		  Page<YuyuexuanzuoView> page =new Query<YuyuexuanzuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuexuanzuoVO> selectListVO(Wrapper<YuyuexuanzuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuexuanzuoVO selectVO(Wrapper<YuyuexuanzuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuexuanzuoView> selectListView(Wrapper<YuyuexuanzuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuexuanzuoView selectView(Wrapper<YuyuexuanzuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuyuexuanzuoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuyuexuanzuoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuyuexuanzuoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
