package cn.zengqingfa.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.zengqingfa.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		System.out.println(11111111);
		return "zengqingfa";
	}

}
