package HQL_Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLpagination {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session s=sf.openSession();
	
	
//	for(int i=0;i<100;i++)
//	{
//		Transaction tx=s.beginTransaction();
//		paginationTable pt=new paginationTable();
//		pt.setId(i);
//		pt.setName("name"+1);
//		pt.setSurname("surname"+i);
//		s.save(pt);
//		tx.commit();
//	}
	
	Query query = s.createQuery("from paginationTable");
	query.setFirstResult(10);
	query.setMaxResults(2);
	List<paginationTable> list = query.list();
	System.out.println("before for loop");
	for( paginationTable list2 :list)
	{
		System.out.println(list2.getId()+"  "+ list2.getName()+"  "+ list2.getSurname());
	}
	System.out.println("after for loop");
	
	
}
}
