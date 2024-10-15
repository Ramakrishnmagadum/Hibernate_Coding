package One_To_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass_Uni {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	
	Question_uni question=new Question_uni();
	question.setQuestionid(101);
	question.setQuestion("what is java");
	Answer_Uni answer =new Answer_Uni();
	answer.setAnswer_id(201);
	answer.setAnswer("java is programing lang");
	question.setAnswer(answer);
	
	
	Question_uni question1=new Question_uni();
	question1.setQuestionid(102);
	question1.setQuestion("what is Final");
	Answer_Uni answer1 =new Answer_Uni();
	answer1.setAnswer_id(202);
	answer1.setAnswer("java is programing lang");
	question1.setAnswer(answer1);
	
	
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	session.save(question);
	session.save(question1);
	tx.commit();
	
}
}
