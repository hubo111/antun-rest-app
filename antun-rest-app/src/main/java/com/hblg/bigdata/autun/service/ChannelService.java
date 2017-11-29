package com.hblg.bigdata.autun.service;

import com.hblg.bigdata.autun.domain.Channel;

public interface ChannelService {

	Channel findByChannelCode(String chanelCode);
}
