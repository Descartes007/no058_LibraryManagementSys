package com.dao;

import com.entity.TushuguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuguihaiVO;
import com.entity.view.TushuguihaiView;


/**
 * 图书归还
 * 
 * @author 
 * @email 
 * @date 2021-03-20 13:31:53
 */
public interface TushuguihaiDao extends BaseMapper<TushuguihaiEntity> {
	
	List<TushuguihaiVO> selectListVO(@Param("ew") Wrapper<TushuguihaiEntity> wrapper);
	
	TushuguihaiVO selectVO(@Param("ew") Wrapper<TushuguihaiEntity> wrapper);
	
	List<TushuguihaiView> selectListView(@Param("ew") Wrapper<TushuguihaiEntity> wrapper);

	List<TushuguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<TushuguihaiEntity> wrapper);
	
	TushuguihaiView selectView(@Param("ew") Wrapper<TushuguihaiEntity> wrapper);
	
}
