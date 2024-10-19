package PostUpdateEventListner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PostUpdateEventListene_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.postupdate.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PostUpdateEventListenee_Bean bean=new PostUpdateEventListenee_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	s.save(bean);
	tx.commit();
	
	PostUpdateEventListenee_Bean bean1=s.get(PostUpdateEventListenee_Bean.class, 123);
	bean1.setName("prashant");
	bean1.setSur_name("magadummm");
	Transaction tx2=s.beginTransaction();
	System.out.println("before updating the value");
	s.update(bean1);
	System.out.println("after updating the value");
	tx2.commit();
	System.out.println("after trasanction done");
}
}
