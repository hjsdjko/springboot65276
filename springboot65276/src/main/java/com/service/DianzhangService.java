package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianzhangView;


/**
 * 店长
 *
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface DianzhangService extends IService<DianzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianzhangVO> selectListVO(Wrapper<DianzhangEntity> wrapper);
   	
   	DianzhangVO selectVO(@Param("ew") Wrapper<DianzhangEntity> wrapper);
   	
   	List<DianzhangView> selectListView(Wrapper<DianzhangEntity> wrapper);
   	
   	DianzhangView selectView(@Param("ew") Wrapper<DianzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianzhangEntity> wrapper);
   	

}

