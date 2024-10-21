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


import com.dao.TushujieyueDao;
import com.entity.TushujieyueEntity;
import com.service.TushujieyueService;
import com.entity.vo.TushujieyueVO;
import com.entity.view.TushujieyueView;

@Service("tushujieyueService")
public class TushujieyueServiceImpl extends ServiceImpl<TushujieyueDao, TushujieyueEntity> implements TushujieyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushujieyueEntity> page = this.selectPage(
                new Query<TushujieyueEntity>(params).getPage(),
                new EntityWrapper<TushujieyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushujieyueEntity> wrapper) {
		  Page<TushujieyueView> page =new Query<TushujieyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushujieyueVO> selectListVO(Wrapper<TushujieyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushujieyueVO selectVO(Wrapper<TushujieyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushujieyueView> selectListView(Wrapper<TushujieyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushujieyueView selectView(Wrapper<TushujieyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
