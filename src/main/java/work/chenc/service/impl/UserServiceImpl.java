package work.chenc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.chenc.entity.UserEntity;
import work.chenc.mapper.UserMapper;
import work.chenc.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserEntity> findAll() {
		return userMapper.findAll();
	}
}
