package PostInsertEventListner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PostInsertEventListene_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.postinsert.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PostInsertEventListenee_Bean bean=new PostInsertEventListenee_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	System.out.println("before saving the entity");
	s.save(bean);
	System.out.println("After saving the entity");
	tx.commit();
	System.out.println("After commiting the entity");
}
}
