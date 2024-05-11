package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DayinfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DayinfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DayinfuwuView;


/**
 * 打印服务
 *
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface DayinfuwuService extends IService<DayinfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DayinfuwuVO> selectListVO(Wrapper<DayinfuwuEntity> wrapper);
   	
   	DayinfuwuVO selectVO(@Param("ew") Wrapper<DayinfuwuEntity> wrapper);
   	
   	List<DayinfuwuView> selectListView(Wrapper<DayinfuwuEntity> wrapper);
   	
   	DayinfuwuView selectView(@Param("ew") Wrapper<DayinfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DayinfuwuEntity> wrapper);
   	

}

