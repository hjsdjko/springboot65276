package com.dao;

import com.entity.DayindianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DayindianVO;
import com.entity.view.DayindianView;


/**
 * 打印店
 * 
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface DayindianDao extends BaseMapper<DayindianEntity> {
	
	List<DayindianVO> selectListVO(@Param("ew") Wrapper<DayindianEntity> wrapper);
	
	DayindianVO selectVO(@Param("ew") Wrapper<DayindianEntity> wrapper);
	
	List<DayindianView> selectListView(@Param("ew") Wrapper<DayindianEntity> wrapper);

	List<DayindianView> selectListView(Pagination page,@Param("ew") Wrapper<DayindianEntity> wrapper);
	
	DayindianView selectView(@Param("ew") Wrapper<DayindianEntity> wrapper);
	

}
