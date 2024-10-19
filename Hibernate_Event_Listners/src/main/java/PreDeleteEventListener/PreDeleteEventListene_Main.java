package PreDeleteEventListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PreDeleteEventListene_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.predelete.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PreDeleteEventListenee_Bean bean=new PreDeleteEventListenee_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	s.save(bean);
	tx.commit();
	
	PreDeleteEventListenee_Bean value=s.get(PreDeleteEventListenee_Bean.class, 123);
	Transaction tx2=s.beginTransaction();
	System.out.println("before delete operation ");
	s.delete(value);
	tx2.commit();	
}
}
