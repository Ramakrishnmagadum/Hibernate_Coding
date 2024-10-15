package One_To_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//this is Bi -Directional Mapping
public class MainClass_Bi {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		Question_Bi question=new Question_Bi();
		question.setQuestionid(101);
		question.setQuestion("what is java");
		Answer_Bi answer =new Answer_Bi();
		answer.setAnswer_id(101);
		answer.setAnswer("java is programing lang");
		question.setAnswer(answer);
		
		
		Question_Bi question1=new Question_Bi();
		question1.setQuestionid(102);
		question1.setQuestion("what is Final");
		Answer_Bi answer1 =new Answer_Bi();
		answer1.setAnswer_id(102);
		answer1.setAnswer("java is programing lang");
		question1.setAnswer(answer1);
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(question);
		session.save(question1);
		tx.commit();
		
	}
}
