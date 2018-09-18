package cn.itcast.Service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.Dao.UserDao;
import cn.itcast.Dao.UserDaoImpl;
@Transactional
public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add() {
		System.out.println("service...");
		userDao.add();
	}
}
