package top.headtop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.headtop.dao.UserDao;
import top.headtop.entity.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userdao;
	
	public void userInsert(User user) {
		userdao.saveUser(user);
	}
	
}
