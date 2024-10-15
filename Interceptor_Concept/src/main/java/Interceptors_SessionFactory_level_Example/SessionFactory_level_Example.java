package Interceptors_SessionFactory_level_Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionFactory_level_Example {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.setInterceptor(new Custome_Interceptor());
	SessionFactory sf = cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	SessionFactory_level_Bean bean=new SessionFactory_level_Bean();
	bean.setId(12);
	bean.setName("ramakrishna");
	bean.setSurname("magadum");
	s.save(bean);
	tx.commit();
	s.close();
	
	Session s1=sf.openSession();
	SessionFactory_level_Bean bean1=new SessionFactory_level_Bean();
	bean1.setId(120);
	bean1.setName("prashant");
	bean1.setSurname("magadum");
	Transaction tx1=s1.beginTransaction();
	s1.save(bean1);
	tx1.commit();
	
	
	
}
}
