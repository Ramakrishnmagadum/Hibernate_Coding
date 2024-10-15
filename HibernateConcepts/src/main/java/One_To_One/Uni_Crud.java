package One_To_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Uni_Crud {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();
	
	//fetching --here only by fetching the question bean --we will get answer object values also.....
	Question_uni ques=session.get(Question_uni.class, 102);
	System.out.println(ques.toString());
	System.out.println(ques.getAnswer().getAnswer());
	
	Transaction tx=session.beginTransaction();
	
	//deleting 
//	session.delete(ques);
//	tx.commit();
	
	//Updating 
	ques.setQuestion("what is final ???");
	session.update(ques);
	tx.commit();
}
}
