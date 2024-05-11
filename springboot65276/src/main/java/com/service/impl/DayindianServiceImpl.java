package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DayindianDao;
import com.entity.DayindianEntity;
import com.service.DayindianService;
import com.entity.vo.DayindianVO;
import com.entity.view.DayindianView;

@Service("dayindianService")
public class DayindianServiceImpl extends ServiceImpl<DayindianDao, DayindianEntity> implements DayindianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DayindianEntity> page = this.selectPage(
                new Query<DayindianEntity>(params).getPage(),
                new EntityWrapper<DayindianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DayindianEntity> wrapper) {
		  Page<DayindianView> page =new Query<DayindianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DayindianVO> selectListVO(Wrapper<DayindianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DayindianVO selectVO(Wrapper<DayindianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DayindianView> selectListView(Wrapper<DayindianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DayindianView selectView(Wrapper<DayindianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
