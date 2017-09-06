package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import mapper.UserMapper;
import pojo.UserPo;
import service.UserService;
import util.ResultHelper;
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	public ResultHelper getAllUsers() {
		List<UserPo> userList = userMapper.getAllUsers();
		String msg = userList == null ? "error" : "success";
		String code = userList == null ? "-1" : "0";
		return new ResultHelper(code,msg,userList);
	}

}
