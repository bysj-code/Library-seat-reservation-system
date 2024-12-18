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
 * 签退信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
@TableName("qiantuixinxi")
public class QiantuixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiantuixinxiEntity() {
		
	}
	
	public QiantuixinxiEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 预约备注
	 */
					
	private String yuyuebeizhu;
	
	/**
	 * 预约时间
	 */
					
	private String yuyueshijian;
	
	/**
	 * 签到备注
	 */
					
	private String qiandaobeizhu;
	
	/**
	 * 签到时间
	 */
					
	private String qiandaoshijian;
	
	/**
	 * 签退备注
	 */
					
	private String qiantuibeizhu;
	
	/**
	 * 签退时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qiantuishijian;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：预约备注
	 */
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(String yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public String getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：签到备注
	 */
	public void setQiandaobeizhu(String qiandaobeizhu) {
		this.qiandaobeizhu = qiandaobeizhu;
	}
	/**
	 * 获取：签到备注
	 */
	public String getQiandaobeizhu() {
		return qiandaobeizhu;
	}
	/**
	 * 设置：签到时间
	 */
	public void setQiandaoshijian(String qiandaoshijian) {
		this.qiandaoshijian = qiandaoshijian;
	}
	/**
	 * 获取：签到时间
	 */
	public String getQiandaoshijian() {
		return qiandaoshijian;
	}
	/**
	 * 设置：签退备注
	 */
	public void setQiantuibeizhu(String qiantuibeizhu) {
		this.qiantuibeizhu = qiantuibeizhu;
	}
	/**
	 * 获取：签退备注
	 */
	public String getQiantuibeizhu() {
		return qiantuibeizhu;
	}
	/**
	 * 设置：签退时间
	 */
	public void setQiantuishijian(Date qiantuishijian) {
		this.qiantuishijian = qiantuishijian;
	}
	/**
	 * 获取：签退时间
	 */
	public Date getQiantuishijian() {
		return qiantuishijian;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}