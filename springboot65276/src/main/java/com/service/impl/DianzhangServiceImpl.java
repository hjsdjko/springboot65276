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


import com.dao.DianzhangDao;
import com.entity.DianzhangEntity;
import com.service.DianzhangService;
import com.entity.vo.DianzhangVO;
import com.entity.view.DianzhangView;

@Service("dianzhangService")
public class DianzhangServiceImpl extends ServiceImpl<DianzhangDao, DianzhangEntity> implements DianzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianzhangEntity> page = this.selectPage(
                new Query<DianzhangEntity>(params).getPage(),
                new EntityWrapper<DianzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianzhangEntity> wrapper) {
		  Page<DianzhangView> page =new Query<DianzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianzhangVO> selectListVO(Wrapper<DianzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianzhangVO selectVO(Wrapper<DianzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianzhangView> selectListView(Wrapper<DianzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianzhangView selectView(Wrapper<DianzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
