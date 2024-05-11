package com.entity.vo;

import com.entity.DayindianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 打印店
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public class DayindianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 店铺名称
	 */
	
	private String dianpumingcheng;
		
	/**
	 * 店铺地址
	 */
	
	private String dianpudizhi;
		
	/**
	 * 店长姓名
	 */
	
	private String dianzhangxingming;
		
	/**
	 * 联系手机
	 */
	
	private String lianxishouji;
		
	/**
	 * 店铺图片
	 */
	
	private String dianputupian;
		
	/**
	 * 主营业务
	 */
	
	private String zhuyingyewu;
		
	/**
	 * 营业时间
	 */
	
	private String yingyeshijian;
		
	/**
	 * 店铺简介
	 */
	
	private String dianpujianjie;
				
	
	/**
	 * 设置：店铺名称
	 */
	 
	public void setDianpumingcheng(String dianpumingcheng) {
		this.dianpumingcheng = dianpumingcheng;
	}
	
	/**
	 * 获取：店铺名称
	 */
	public String getDianpumingcheng() {
		return dianpumingcheng;
	}
				
	
	/**
	 * 设置：店铺地址
	 */
	 
	public void setDianpudizhi(String dianpudizhi) {
		this.dianpudizhi = dianpudizhi;
	}
	
	/**
	 * 获取：店铺地址
	 */
	public String getDianpudizhi() {
		return dianpudizhi;
	}
				
	
	/**
	 * 设置：店长姓名
	 */
	 
	public void setDianzhangxingming(String dianzhangxingming) {
		this.dianzhangxingming = dianzhangxingming;
	}
	
	/**
	 * 获取：店长姓名
	 */
	public String getDianzhangxingming() {
		return dianzhangxingming;
	}
				
	
	/**
	 * 设置：联系手机
	 */
	 
	public void setLianxishouji(String lianxishouji) {
		this.lianxishouji = lianxishouji;
	}
	
	/**
	 * 获取：联系手机
	 */
	public String getLianxishouji() {
		return lianxishouji;
	}
				
	
	/**
	 * 设置：店铺图片
	 */
	 
	public void setDianputupian(String dianputupian) {
		this.dianputupian = dianputupian;
	}
	
	/**
	 * 获取：店铺图片
	 */
	public String getDianputupian() {
		return dianputupian;
	}
				
	
	/**
	 * 设置：主营业务
	 */
	 
	public void setZhuyingyewu(String zhuyingyewu) {
		this.zhuyingyewu = zhuyingyewu;
	}
	
	/**
	 * 获取：主营业务
	 */
	public String getZhuyingyewu() {
		return zhuyingyewu;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：店铺简介
	 */
	 
	public void setDianpujianjie(String dianpujianjie) {
		this.dianpujianjie = dianpujianjie;
	}
	
	/**
	 * 获取：店铺简介
	 */
	public String getDianpujianjie() {
		return dianpujianjie;
	}
			
}
