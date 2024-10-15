package One_To_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import One_To_One.Question_uni;

public class OTM_MTO_Crud {

public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();
	
	//fetching --here only by fetching the question bean --we will get answer object values also.....
	Question_OTM ques=session.get(Question_OTM.class, 103);
	System.out.println(ques.toString());
	
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
