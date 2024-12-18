package com.entity.view;

import com.entity.YuyuexuanzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约选座
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
@TableName("yuyuexuanzuo")
public class YuyuexuanzuoView  extends YuyuexuanzuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuexuanzuoView(){
	}
 
 	public YuyuexuanzuoView(YuyuexuanzuoEntity yuyuexuanzuoEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuexuanzuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
