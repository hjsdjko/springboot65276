package com.dao;

import com.entity.YuyuedayinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuedayinVO;
import com.entity.view.YuyuedayinView;


/**
 * 预约打印
 * 
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface YuyuedayinDao extends BaseMapper<YuyuedayinEntity> {
	
	List<YuyuedayinVO> selectListVO(@Param("ew") Wrapper<YuyuedayinEntity> wrapper);
	
	YuyuedayinVO selectVO(@Param("ew") Wrapper<YuyuedayinEntity> wrapper);
	
	List<YuyuedayinView> selectListView(@Param("ew") Wrapper<YuyuedayinEntity> wrapper);

	List<YuyuedayinView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuedayinEntity> wrapper);
	
	YuyuedayinView selectView(@Param("ew") Wrapper<YuyuedayinEntity> wrapper);
	

}
