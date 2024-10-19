package PreUpdateEventListner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PreUpdateEventListene_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.preupdate.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PreUpdateEventListenee_Bean bean=new PreUpdateEventListenee_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	s.save(bean);
	tx.commit();
	
	PreUpdateEventListenee_Bean bean1=s.get(PreUpdateEventListenee_Bean.class, 123);
	bean1.setName("prashant");
	bean1.setSur_name("magadummm");
	Transaction tx2=s.beginTransaction();
	System.out.println("before updating the value");
	s.update(bean1);
	tx2.commit();
	
}
}
