package Save_Method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save_method_Example {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.withOptions().interceptor(new save_Interceptor()).openSession();
	Transaction tx=s.beginTransaction();
	Save_Method_Bean bean=new Save_Method_Bean();
	bean.setId(12);
	bean.setName("ramakrishna");
	bean.setSurname("magadum");
	s.save(bean);
	tx.commit();
}
}
