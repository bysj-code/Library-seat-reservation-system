package com.entity.view;

import com.entity.DiscusstushuguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书馆评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 20:42:23
 */
@TableName("discusstushuguan")
public class DiscusstushuguanView  extends DiscusstushuguanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstushuguanView(){
	}
 
 	public DiscusstushuguanView(DiscusstushuguanEntity discusstushuguanEntity){
 	try {
			BeanUtils.copyProperties(this, discusstushuguanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
