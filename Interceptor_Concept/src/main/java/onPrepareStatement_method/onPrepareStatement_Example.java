package onPrepareStatement_method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Save_Method.Save_Method_Bean;

public class onPrepareStatement_Example {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.withOptions().interceptor(new onPrepareStatement_Interceptor()).openSession();
	Transaction tx=s.beginTransaction();
	Save_Method_Bean bean=new Save_Method_Bean();
	bean.setId(12);
	bean.setName("ramakrishna");
	bean.setSurname("magadum");
	s.save(bean);
	tx.commit();
}
}
