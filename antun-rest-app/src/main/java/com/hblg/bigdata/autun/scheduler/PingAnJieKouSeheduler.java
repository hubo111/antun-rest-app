package com.hblg.bigdata.autun.scheduler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hblg.bigdata.autun.domain.User;
import com.hblg.bigdata.autun.remote.PingAnJieKouSender;
import com.hblg.bigdata.autun.service.UserService;

@Component
public class PingAnJieKouSeheduler {

	private Logger logger=LoggerFactory.getLogger(PingAnJieKouSeheduler.class);
	@Autowired
	private UserService userService;
	@Autowired
	private PingAnJieKouSender pingAnJieKouSender;
	@Scheduled(cron="* * * * * ?")
	public void send(){
		logger.info("平安定时任务开始。。。。");
		//��ѯ������δ���͵����ݣ�status=0��
		List<User> users=userService.findByStatus(0);
		logger.info("有"+users.size()+"条数据待发送");
		if(users.isEmpty())
			return;
		//ѭ������
		for(User user:users){
			pingAnJieKouSender.send(user);
		}
		logger.info("平安定时任务结束。。。。");
	}
}
