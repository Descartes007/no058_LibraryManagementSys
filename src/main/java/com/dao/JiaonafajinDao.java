package com.dao;

import com.entity.JiaonafajinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaonafajinVO;
import com.entity.view.JiaonafajinView;


/**
 * 缴纳罚金
 * 
 * @author 
 * @email 
 * @date 2021-03-20 13:31:53
 */
public interface JiaonafajinDao extends BaseMapper<JiaonafajinEntity> {
	
	List<JiaonafajinVO> selectListVO(@Param("ew") Wrapper<JiaonafajinEntity> wrapper);
	
	JiaonafajinVO selectVO(@Param("ew") Wrapper<JiaonafajinEntity> wrapper);
	
	List<JiaonafajinView> selectListView(@Param("ew") Wrapper<JiaonafajinEntity> wrapper);

	List<JiaonafajinView> selectListView(Pagination page,@Param("ew") Wrapper<JiaonafajinEntity> wrapper);
	
	JiaonafajinView selectView(@Param("ew") Wrapper<JiaonafajinEntity> wrapper);
	
}
