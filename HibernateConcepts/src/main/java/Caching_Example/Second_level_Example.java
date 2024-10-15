package Caching_Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import HQL_Query.paginationTable;

public class Second_level_Example {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		paginationTable list = s.get(paginationTable.class, 12);
		System.out.println(list);
		s.close();
		
		Session s1=sf.openSession();
//		here also same operaation is doing , getting data which is having id is "12"
	// and privious data is was stored in second level cache and it will get from cache --so no need to fire the query 
		paginationTable list2 = s1.get(paginationTable.class, 12);
		System.out.println(list2);
	}
	
}
