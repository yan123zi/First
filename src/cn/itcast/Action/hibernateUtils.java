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
	//�ṩ�뱾���̰߳󶨵�session���߳̽����Զ��ر�
	public static Session getSessionObject() {
		return sessionFactory.getCurrentSession();
	}
	public  static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
