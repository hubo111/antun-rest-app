package com.hblg.bigdata.autun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hblg.bigdata.autun.domain.Channel;
import com.hblg.bigdata.autun.domain.ChannelExample;
import com.hblg.bigdata.autun.domain.ChannelExample.Criteria;
import com.hblg.bigdata.autun.mapper.ChannelMapper;

@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	private ChannelMapper channelMapper;

	
	@Override
	public Channel findByChannelCode(String chanelCode) {
		// TODO Auto-generated method stub
		ChannelExample channelExample = new ChannelExample();
		Criteria createCriteria = channelExample.createCriteria();
		createCriteria.andCodeEqualTo(chanelCode);
		List<Channel> selectByExample = channelMapper.selectByExample(channelExample);
		if(selectByExample.isEmpty())
			return null;
		return selectByExample.get(0);
	}

}
