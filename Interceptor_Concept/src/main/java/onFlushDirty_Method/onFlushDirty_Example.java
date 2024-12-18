package onFlushDirty_Method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onDelete_Method.OnDelete_Bean;
import onDelete_Method.OnDelete_Interceptor;

public class onFlushDirty_Example {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.setInterceptor(new onFlushDirty_Interceptor());
		SessionFactory sf = cfg.buildSessionFactory();
		
		//inserting the values to DB
		Session s = sf.openSession();
		onFlushDirty_Bean bean = new onFlushDirty_Bean();
		Transaction tx = s.beginTransaction();
		bean.setAge(12);
		bean.setId(120);
		bean.setName("ram");
		s.save(bean);
		tx.commit();
		s.close();
		
		
		//updating the values.....
		Session s2 = sf.openSession();
		Transaction tx2=s2.beginTransaction();
		onFlushDirty_Bean value=s2.get(onFlushDirty_Bean.class, 120);
		
		value.setName("ramakrishna");
		s2.update(value);
		tx2.commit();
	}

}
