package Batch_Proccessing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import HQL_Query.paginationTable;

public class Batch_Proccessing {
public static void main(String[] args) {
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	
	//we are setting batch size in java code
	s.setJdbcBatchSize(10);
	Transaction tx=s.beginTransaction();
	
	
	for(int i=1;i<=100;i++)
	{
		Batch_bean p=new Batch_bean();
		p.setName("name "+ i);
		p.setSurname("surname "+i);
		
		s.save(p);
		
		if(i%s.getJdbcBatchSize() ==0)
		{
			s.flush();
			s.clear();
			System.out.println("batch excuting");
		}
		
	}
	tx.commit();
	
}
}
