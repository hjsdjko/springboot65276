package com.entity.view;

import com.entity.DayinfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 打印服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
@TableName("dayinfuwu")
public class DayinfuwuView  extends DayinfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DayinfuwuView(){
	}
 
 	public DayinfuwuView(DayinfuwuEntity dayinfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, dayinfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
