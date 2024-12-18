package Caching_Example;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class First_Level_Enabaling_by_Externally {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		Query q=s.createQuery("from paginationTable where id=:x");
		q.setParameter("x", 12);
		q.setCacheable(true); 
		System.out.println(q.list());
		
		Query q1=s.createQuery("from paginationTable where id=:x");
		q1.setParameter("x", 12);
		q1.setCacheable(true); 
		System.out.println(q1.list());
	}		
}
