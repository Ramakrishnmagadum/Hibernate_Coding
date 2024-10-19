package PreLoadEventListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PreLoadEventListener_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.preload.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PreLoadEventListener_Bean bean=new PreLoadEventListener_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	s.save(bean);
	tx.commit();
	s.close();//here we need to close the session..............
	Session s2=sf.openSession();
	PreLoadEventListener_Bean bean2=s2.load(PreLoadEventListener_Bean.class, 123);
	System.out.println(bean2.getName());//if we fetch other then primarykey preloadEventListner will get trigger
	
}
}
