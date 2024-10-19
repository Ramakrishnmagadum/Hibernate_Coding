package PreInsertEventListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PreInsertEventListene_Main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	PreInsertEventListenee_Bean bean=new PreInsertEventListenee_Bean();
	bean.setId(123);
	bean.setName("ramakrishna");
	bean.setSur_name("magadum");
	s.save(bean);
	tx.commit();
}
}
