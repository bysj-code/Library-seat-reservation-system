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


import com.dao.QiantuixinxiDao;
import com.entity.QiantuixinxiEntity;
import com.service.QiantuixinxiService;
import com.entity.vo.QiantuixinxiVO;
import com.entity.view.QiantuixinxiView;

@Service("qiantuixinxiService")
public class QiantuixinxiServiceImpl extends ServiceImpl<QiantuixinxiDao, QiantuixinxiEntity> implements QiantuixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiantuixinxiEntity> page = this.selectPage(
                new Query<QiantuixinxiEntity>(params).getPage(),
                new EntityWrapper<QiantuixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiantuixinxiEntity> wrapper) {
		  Page<QiantuixinxiView> page =new Query<QiantuixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiantuixinxiVO> selectListVO(Wrapper<QiantuixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiantuixinxiVO selectVO(Wrapper<QiantuixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiantuixinxiView> selectListView(Wrapper<QiantuixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiantuixinxiView selectView(Wrapper<QiantuixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
