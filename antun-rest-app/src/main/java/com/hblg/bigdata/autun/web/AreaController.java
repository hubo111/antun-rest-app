package com.hblg.bigdata.autun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hblg.bigdata.autun.domain.Area;
import com.hblg.bigdata.autun.service.AreaService;
import com.hblg.bigdata.autun.web.response.BaseResponse;

@RestController
@RequestMapping("/areas")
public class AreaController extends BaseResponse{

	@Autowired
	private AreaService areaservice;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public BaseResponse findAll(@PathVariable Long id){
		
		List<Area> areas=areaservice.findPrentId(id);
		
		return BaseResponse.successResponse("�ɹ�").data(areas);
	}
}
