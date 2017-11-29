package com.hblg.bigdata.autun.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hblg.bigdata.autun.domain.User;
import com.hblg.bigdata.autun.domain.UserExample;
import com.hblg.bigdata.autun.domain.UserExample.Criteria;
import com.hblg.bigdata.autun.mapper.UserMapper;
import com.hblg.bigdata.autun.util.TransferUtil;
import com.hblg.bigdata.autun.web.model.UserAdd;
import com.hblg.bigdata.autun.web.model.UserUpdate;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		
		// TODO Auto-generated method stub
		return userMapper.selectByExample(null);
	}

	@Override
	public int addUser(UserAdd userAdd) {
		// TODO Auto-generated method stub
		User transfer = TransferUtil.transfer(userAdd, User.class);
		transfer.setGmtCreate(new Date());
		transfer.setGmtModified(new Date());
		return userMapper.insertSelective(transfer);
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateUser(Long id, UserUpdate userUpdate) {
		// TODO Auto-generated method stub
		User user = TransferUtil.transfer(userUpdate, User.class);
		user.setId(id);
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int deleteUser(Long id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User findByPhone(String phone) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		//ƴ�Ӳ�ѯ����
		createCriteria.andPhoneEqualTo(phone);
		List<User> selectByExample = userMapper.selectByExample(userExample);
		if(selectByExample.isEmpty())
			return null;
		return selectByExample.get(0);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public List<User> findByStatus(int i) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		createCriteria.andStutusEqualTo(i);
		return userMapper.selectByExample(userExample);
	}

}
