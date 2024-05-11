package com.dao;

import com.entity.DayinfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DayinfuwuVO;
import com.entity.view.DayinfuwuView;


/**
 * 打印服务
 * 
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface DayinfuwuDao extends BaseMapper<DayinfuwuEntity> {
	
	List<DayinfuwuVO> selectListVO(@Param("ew") Wrapper<DayinfuwuEntity> wrapper);
	
	DayinfuwuVO selectVO(@Param("ew") Wrapper<DayinfuwuEntity> wrapper);
	
	List<DayinfuwuView> selectListView(@Param("ew") Wrapper<DayinfuwuEntity> wrapper);

	List<DayinfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DayinfuwuEntity> wrapper);
	
	DayinfuwuView selectView(@Param("ew") Wrapper<DayinfuwuEntity> wrapper);
	

}
