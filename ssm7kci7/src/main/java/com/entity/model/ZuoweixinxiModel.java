package com.entity.model;

import com.entity.ZuoweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 座位信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public class ZuoweixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 座位编号
	 */
	
	private String zuoweibianhao;
		
	/**
	 * 座位图片
	 */
	
	private String zuoweitupian;
		
	/**
	 * 座位位置
	 */
	
	private String zuoweiweizhi;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 座位详情
	 */
	
	private String zuoweixiangqing;
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：座位编号
	 */
	 
	public void setZuoweibianhao(String zuoweibianhao) {
		this.zuoweibianhao = zuoweibianhao;
	}
	
	/**
	 * 获取：座位编号
	 */
	public String getZuoweibianhao() {
		return zuoweibianhao;
	}
				
	
	/**
	 * 设置：座位图片
	 */
	 
	public void setZuoweitupian(String zuoweitupian) {
		this.zuoweitupian = zuoweitupian;
	}
	
	/**
	 * 获取：座位图片
	 */
	public String getZuoweitupian() {
		return zuoweitupian;
	}
				
	
	/**
	 * 设置：座位位置
	 */
	 
	public void setZuoweiweizhi(String zuoweiweizhi) {
		this.zuoweiweizhi = zuoweiweizhi;
	}
	
	/**
	 * 获取：座位位置
	 */
	public String getZuoweiweizhi() {
		return zuoweiweizhi;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：座位详情
	 */
	 
	public void setZuoweixiangqing(String zuoweixiangqing) {
		this.zuoweixiangqing = zuoweixiangqing;
	}
	
	/**
	 * 获取：座位详情
	 */
	public String getZuoweixiangqing() {
		return zuoweixiangqing;
	}
			
}
