package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 座位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
@TableName("zuoweixinxi")
public class ZuoweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoweixinxiEntity() {
		
	}
	
	public ZuoweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
