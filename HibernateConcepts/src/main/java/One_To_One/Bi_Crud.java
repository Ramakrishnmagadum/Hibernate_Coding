package One_To_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Bi_Crud {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		
		//fetching --here only by fetching the question bean --we will get answer object values also.....
		Answer_Bi ques=session.get(Answer_Bi.class, 102);
		System.out.println(ques.toString());
		System.out.println(ques.getAnswer());
		
		Transaction tx=session.beginTransaction();
		
		//deleting 
//		session.delete(ques);
//		tx.commit();
		
		//Updating 
		ques.getQuestion().setQuestion("what is final ???");
		session.update(ques);
		tx.commit();
	}
}
