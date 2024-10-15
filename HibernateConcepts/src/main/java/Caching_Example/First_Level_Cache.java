package Caching_Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import HQL_Query.paginationTable;


//First level cache by default enable 

public class First_Level_Cache {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	
	
//	how we are proving the first level query 
//	i will get data which is having id as 12--for this it will fire query 
//	Query:---
//	 select pagination0_.id as id1_5_0_, pagination0_.name as name2_5_0_, pagination0_.surname as surname3_5_0_ 
//            from  paginationTable pagination0_ where pagination0_.id=?
	
//	it will fire and get the data with id is "12"
	paginationTable list = s.get(paginationTable.class, 12);
	System.out.println(list);
	
//	here also same operaation is doing , getting data which is having id is "12"
// and privious data is was stored in first level cache and it will get from cache --so no need to fire the query 
	paginationTable list2 = s.get(paginationTable.class, 12);
	System.out.println(list2);
	
	
	
	
//------------it won't follow the first level cache ---because ----------------
//	Each call to s.createCriteria() creates a new Criteria object. Even though both queries are looking for the same entity with id = 11,
//	they are treated as distinct queries by Hibernate. This means that they do not share the same cached results.
	
//	 Criteria q = s.createCriteria(paginationTable.class);
//	 q.add(Restrictions.eq("id", 11));
//	System.out.println(q.list());
//	
//	 Criteria q2 = s.createCriteria(paginationTable.class);
//	 q2.add(Restrictions.eq("id", 11));
//	System.out.println(q2.list());
	
	
	
	
	
	//------------it won't follow the first level cache ---because ----------------
//	Each call to s.createQuery() creates a new Query object. Even though both queries are looking for the same entity with id = 11,
//	they are treated as distinct queries by Hibernate. This means that they do not share the same cached results.
	

//	Query q=s.createQuery("from paginationTable where id=:x");
//	q.setParameter("x", 12);
//	System.out.println(q.list());
//	
//	Query q1=s.createQuery("from paginationTable where id=:x");
//	q1.setParameter("x", 12);
//	System.out.println(q1.list());

	s.close();
}
}
