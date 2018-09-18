package cn.itcast.Action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtils {
	static Configuration cfg=null;
	static SessionFactory sessionFactory=null;
	static {
		cfg=new Configuration();
		cfg.configure();
		sessionFactory=cfg.buildSessionFactory();
	}
	//提供与本地线程绑定的session，线程结束自动关闭
	public static Session getSessionObject() {
		return sessionFactory.getCurrentSession();
	}
	public  static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
