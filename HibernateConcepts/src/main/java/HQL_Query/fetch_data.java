package HQL_Query;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import One_To_Many.Answer_OTM;
import One_To_Many.Question_OTM;
import One_To_One.Question_uni;

public class fetch_data {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();

		
		//fetching whole table data...
//		Query query=s.createQuery("from Question_uni");
//		List<Question_uni> list = query.getResultList();
//		for(Question_uni list2: list)
//		{
//			System.out.println(list2.toString());
//		}
		
		
		//fetching data with where condition....
//		Query<Question_uni> query=s.createQuery(" from Question_uni as q where q.questionid =:x");
//		query.setParameter("x", 102);
//		List list = query.getResultList();
//		for(Object list2: list)
//		{
//			System.out.println(list2);
//		}
		
//		Query<Question_uni> query=s.createQuery(" from Question_uni as q where q.questionid =:x and q.answerr=201");
//		query.setParameter("x", 101);
//		List list = query.getResultList();
//		for(Object list2: list)
//		{
//			System.out.println(list2);
//		}
		
		
		
//		 ORDER BY Clause
//     	Query<Question_uni> query=s.createQuery(" from Question_uni as q  ORDER BY q.questionid ASC");	
//		List list = query.getResultList();
//		for(Object list2: list)
//		{
//			System.out.println(list2);
//		}
		
		
//		 UPDATE Clause
//		Transaction tx = s.beginTransaction();
//     	Query<Question_uni> query=s.createQuery("UPDATE Question_uni as q set q.question=:x where q.questionid =101");	
//     	query.setParameter("x", "what is java java");
//     	query.executeUpdate();
//     	tx.commit();
//		System.out.println("updated...");
		

		//DELETE Clause
//		Transaction tx = s.beginTransaction();
//     	Query<Question_uni> query=s.createQuery("DELETE from Question_uni as q where q.questionid =101");	
//     	query.executeUpdate();
//     	tx.commit();
//		System.out.println("deleted...");
		
		
		
//	    Using Inner Query 	
//		Query query=s.createQuery("select q.question , q.questionid , a.answer from Question_uni as q INNER JOIN q.answerr as a");
//		List<Object []> list = query.getResultList();
//		for(Object [] list2: list)
//		{
//			System.out.println(list2);
//		}
		
		
	}
}
