package com.hblg.bigdata.autun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hblg.bigdata.autun.domain.Area;
import com.hblg.bigdata.autun.domain.AreaExample;
import com.hblg.bigdata.autun.domain.AreaExample.Criteria;
import com.hblg.bigdata.autun.mapper.AreaMapper;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaMapper areaMapper;
	
	@Override
	public Area findById(Long town) {
		// TODO Auto-generated method stub
		return areaMapper.selectByPrimaryKey(town);
	}

	@Override
	public List<Area> findPrentId(Long id) {
		// TODO Auto-generated method stub
		
		AreaExample areaExample=new AreaExample();
		
		Criteria createCriteria = areaExample.createCriteria();
		
		createCriteria.andParentIdEqualTo(id);
		
		
		return areaMapper.selectByExample(areaExample);
	}

}
