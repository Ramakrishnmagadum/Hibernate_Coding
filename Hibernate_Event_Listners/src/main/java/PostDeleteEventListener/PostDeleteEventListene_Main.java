package PostDeleteEventListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PostDeleteEventListene_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.postdelete.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PostDeleteEventListenee_Bean bean=new PostDeleteEventListenee_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	s.save(bean);
	tx.commit();
	
	PostDeleteEventListenee_Bean value=s.get(PostDeleteEventListenee_Bean.class, 123);
	Transaction tx2=s.beginTransaction();
	System.out.println("before delete operation ");
	s.delete(value);
	System.out.println("after delete operation");
	tx2.commit();	
}
}
