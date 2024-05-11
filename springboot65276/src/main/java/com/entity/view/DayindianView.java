package com.entity.view;

import com.entity.DayindianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 打印店
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
@TableName("dayindian")
public class DayindianView  extends DayindianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DayindianView(){
	}
 
 	public DayindianView(DayindianEntity dayindianEntity){
 	try {
			BeanUtils.copyProperties(this, dayindianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
