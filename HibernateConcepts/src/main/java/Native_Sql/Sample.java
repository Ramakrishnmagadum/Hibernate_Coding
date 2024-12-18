package Native_Sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import HQL_Query.paginationTable;

public class Sample {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session s=sf.openSession();
	
	NativeQuery q = s.createSQLQuery("select * from paginationTable where id <11");
	List<Object[]> list=q.list();
	for(Object[] list2:list)
	{
		System.out.println(Arrays.toString(list2));
	}
	System.out.println("completed");
	
}
}
