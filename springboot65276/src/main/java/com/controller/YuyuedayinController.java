package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuyuedayinEntity;
import com.entity.view.YuyuedayinView;

import com.service.YuyuedayinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 预约打印
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-26 17:00:56
 */
@RestController
@RequestMapping("/yuyuedayin")
public class YuyuedayinController {
    @Autowired
    private YuyuedayinService yuyuedayinService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyuedayinEntity yuyuedayin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dianzhang")) {
			yuyuedayin.setDianzhangzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yuyuedayin.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyuedayinEntity> ew = new EntityWrapper<YuyuedayinEntity>();
		PageUtils page = yuyuedayinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuedayin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyuedayinEntity yuyuedayin, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dianzhang")) {
			yuyuedayin.setDianzhangzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yuyuedayin.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyuedayinEntity> ew = new EntityWrapper<YuyuedayinEntity>();
		PageUtils page = yuyuedayinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuedayin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyuedayinEntity yuyuedayin){
       	EntityWrapper<YuyuedayinEntity> ew = new EntityWrapper<YuyuedayinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyuedayin, "yuyuedayin")); 
        return R.ok().put("data", yuyuedayinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyuedayinEntity yuyuedayin){
        EntityWrapper< YuyuedayinEntity> ew = new EntityWrapper< YuyuedayinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyuedayin, "yuyuedayin")); 
		YuyuedayinView yuyuedayinView =  yuyuedayinService.selectView(ew);
		return R.ok("查询预约打印成功").put("data", yuyuedayinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuyuedayinEntity yuyuedayin = yuyuedayinService.selectById(id);
        return R.ok().put("data", yuyuedayin);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuyuedayinEntity yuyuedayin = yuyuedayinService.selectById(id);
        return R.ok().put("data", yuyuedayin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyuedayinEntity yuyuedayin, HttpServletRequest request){
    	yuyuedayin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuedayin);
        yuyuedayinService.insert(yuyuedayin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyuedayinEntity yuyuedayin, HttpServletRequest request){
    	yuyuedayin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuedayin);
    	yuyuedayin.setUserid((Long)request.getSession().getAttribute("userId"));
        yuyuedayinService.insert(yuyuedayin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuyuedayinEntity yuyuedayin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyuedayin);
        yuyuedayinService.updateById(yuyuedayin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyuedayinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YuyuedayinEntity> wrapper = new EntityWrapper<YuyuedayinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dianzhang")) {
			wrapper.eq("dianzhangzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuyuedayinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
