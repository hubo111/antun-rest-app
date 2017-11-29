package com.hblg.bigdata.autun.service;

import java.util.List;

import com.hblg.bigdata.autun.domain.User;
import com.hblg.bigdata.autun.web.model.UserAdd;
import com.hblg.bigdata.autun.web.model.UserUpdate;

public interface UserService {

	List<User> findAll();

	int addUser(UserAdd userAdd);

	User getUser(Long id);

	int updateUser(Long id, UserUpdate userUpdate);

	int deleteUser(Long id);

	User findByPhone(String phone);
	
	int updateUser(User user);

	List<User> findByStatus(int i);

}
