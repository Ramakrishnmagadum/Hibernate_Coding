package PostLoadEventListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PostLoadEventListener_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.postload.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PostLoadEventListener_Bean bean=new PostLoadEventListener_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	s.save(bean);
	tx.commit();
	s.close();//here we need to close the session..............
	Session s2=sf.openSession();
	PostLoadEventListener_Bean bean2=s2.load(PostLoadEventListener_Bean.class, 123);
	System.out.println("before loading");
	System.out.println(bean2.getName());//if we fetch other then primarykey preloadEventListner will get trigger
	System.out.println("after loading ");
}
}
