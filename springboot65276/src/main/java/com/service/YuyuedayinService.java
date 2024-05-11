package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuedayinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuedayinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuedayinView;


/**
 * 预约打印
 *
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface YuyuedayinService extends IService<YuyuedayinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuedayinVO> selectListVO(Wrapper<YuyuedayinEntity> wrapper);
   	
   	YuyuedayinVO selectVO(@Param("ew") Wrapper<YuyuedayinEntity> wrapper);
   	
   	List<YuyuedayinView> selectListView(Wrapper<YuyuedayinEntity> wrapper);
   	
   	YuyuedayinView selectView(@Param("ew") Wrapper<YuyuedayinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuedayinEntity> wrapper);
   	

}

