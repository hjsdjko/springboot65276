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


import com.dao.DayinfuwuDao;
import com.entity.DayinfuwuEntity;
import com.service.DayinfuwuService;
import com.entity.vo.DayinfuwuVO;
import com.entity.view.DayinfuwuView;

@Service("dayinfuwuService")
public class DayinfuwuServiceImpl extends ServiceImpl<DayinfuwuDao, DayinfuwuEntity> implements DayinfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DayinfuwuEntity> page = this.selectPage(
                new Query<DayinfuwuEntity>(params).getPage(),
                new EntityWrapper<DayinfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DayinfuwuEntity> wrapper) {
		  Page<DayinfuwuView> page =new Query<DayinfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DayinfuwuVO> selectListVO(Wrapper<DayinfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DayinfuwuVO selectVO(Wrapper<DayinfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DayinfuwuView> selectListView(Wrapper<DayinfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DayinfuwuView selectView(Wrapper<DayinfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
