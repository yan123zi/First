package cn.itcast.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.itcast.entity.User;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
//		User user=new User();
//		user.setAddress("۶��");
//		user.setUsername("���ӽ�");
//		hibernateTemplate.save(user);
		User us=hibernateTemplate.get(User.class, 2);
		System.out.println(us);
		List<User> list=(List<User>) hibernateTemplate.find("from User");
		System.out.println(list);
		List<User> list1=(List<User>) hibernateTemplate.find("from User where username=?","ϰ��ƽ");
		System.out.println(list1);
	}
}
