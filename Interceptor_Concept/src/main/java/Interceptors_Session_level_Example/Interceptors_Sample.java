package Interceptors_Session_level_Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Interceptors_Sample {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// this line used to create interceptors for session level
//	-- new Custome_Interceptor() --this is our interceotors class , here we wrote the code 
		Session s = sf.withOptions().interceptor(new Custome_Interceptor()).openSession();
		Session_level_Bean bean = new Session_level_Bean();

		Transaction tx = s.beginTransaction();

		bean.setId(12);
		bean.setName("ramakrishna");
		bean.setSurname("magadum");

		s.save(bean);
		tx.commit();
		System.out.println("completed");

	}
}
