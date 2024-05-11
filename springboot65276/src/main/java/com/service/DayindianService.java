package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DayindianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DayindianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DayindianView;


/**
 * 打印店
 *
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface DayindianService extends IService<DayindianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DayindianVO> selectListVO(Wrapper<DayindianEntity> wrapper);
   	
   	DayindianVO selectVO(@Param("ew") Wrapper<DayindianEntity> wrapper);
   	
   	List<DayindianView> selectListView(Wrapper<DayindianEntity> wrapper);
   	
   	DayindianView selectView(@Param("ew") Wrapper<DayindianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DayindianEntity> wrapper);
   	

}

