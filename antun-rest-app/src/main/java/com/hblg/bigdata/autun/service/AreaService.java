package com.hblg.bigdata.autun.service;

import java.util.List;

import com.hblg.bigdata.autun.domain.Area;

public interface AreaService {

	Area findById(Long town);

	List<Area> findPrentId(Long id);
		
	
}
