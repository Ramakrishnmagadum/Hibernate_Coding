package onDelete_Method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class onDelete_Example {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.setInterceptor(new OnDelete_Interceptor());
		SessionFactory sf = cfg.buildSessionFactory();
		
		//inserting the values to DB
		Session s = sf.openSession();
		OnDelete_Bean bean = new OnDelete_Bean();
		Transaction tx = s.beginTransaction();
		bean.setAge(12);
		bean.setId(120);
		bean.setName("ram");
		s.save(bean);
		tx.commit();
		s.close();

//		deleting the entity
		Session s2 = sf.openSession();
		OnDelete_Bean value = s2.get(OnDelete_Bean.class, 120);
		Transaction tx2 = s2.beginTransaction();
		s2.delete(value);
		tx2.commit();

	}
}
