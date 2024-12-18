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


import com.dao.DiscusstushuguanDao;
import com.entity.DiscusstushuguanEntity;
import com.service.DiscusstushuguanService;
import com.entity.vo.DiscusstushuguanVO;
import com.entity.view.DiscusstushuguanView;

@Service("discusstushuguanService")
public class DiscusstushuguanServiceImpl extends ServiceImpl<DiscusstushuguanDao, DiscusstushuguanEntity> implements DiscusstushuguanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstushuguanEntity> page = this.selectPage(
                new Query<DiscusstushuguanEntity>(params).getPage(),
                new EntityWrapper<DiscusstushuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstushuguanEntity> wrapper) {
		  Page<DiscusstushuguanView> page =new Query<DiscusstushuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstushuguanVO> selectListVO(Wrapper<DiscusstushuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstushuguanVO selectVO(Wrapper<DiscusstushuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstushuguanView> selectListView(Wrapper<DiscusstushuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstushuguanView selectView(Wrapper<DiscusstushuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
