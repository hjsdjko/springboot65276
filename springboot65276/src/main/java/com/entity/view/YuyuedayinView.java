package com.entity.view;

import com.entity.YuyuedayinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约打印
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
@TableName("yuyuedayin")
public class YuyuedayinView  extends YuyuedayinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuedayinView(){
	}
 
 	public YuyuedayinView(YuyuedayinEntity yuyuedayinEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuedayinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
