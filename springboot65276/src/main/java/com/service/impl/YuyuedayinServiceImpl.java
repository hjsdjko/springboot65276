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


import com.dao.YuyuedayinDao;
import com.entity.YuyuedayinEntity;
import com.service.YuyuedayinService;
import com.entity.vo.YuyuedayinVO;
import com.entity.view.YuyuedayinView;

@Service("yuyuedayinService")
public class YuyuedayinServiceImpl extends ServiceImpl<YuyuedayinDao, YuyuedayinEntity> implements YuyuedayinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuedayinEntity> page = this.selectPage(
                new Query<YuyuedayinEntity>(params).getPage(),
                new EntityWrapper<YuyuedayinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuedayinEntity> wrapper) {
		  Page<YuyuedayinView> page =new Query<YuyuedayinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuedayinVO> selectListVO(Wrapper<YuyuedayinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuedayinVO selectVO(Wrapper<YuyuedayinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuedayinView> selectListView(Wrapper<YuyuedayinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuedayinView selectView(Wrapper<YuyuedayinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
