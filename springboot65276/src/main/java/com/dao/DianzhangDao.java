package com.dao;

import com.entity.DianzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianzhangVO;
import com.entity.view.DianzhangView;


/**
 * 店长
 * 
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
public interface DianzhangDao extends BaseMapper<DianzhangEntity> {
	
	List<DianzhangVO> selectListVO(@Param("ew") Wrapper<DianzhangEntity> wrapper);
	
	DianzhangVO selectVO(@Param("ew") Wrapper<DianzhangEntity> wrapper);
	
	List<DianzhangView> selectListView(@Param("ew") Wrapper<DianzhangEntity> wrapper);

	List<DianzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DianzhangEntity> wrapper);
	
	DianzhangView selectView(@Param("ew") Wrapper<DianzhangEntity> wrapper);
	

}
