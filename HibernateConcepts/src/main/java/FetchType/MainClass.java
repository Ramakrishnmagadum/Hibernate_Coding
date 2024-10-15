package FetchType;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import One_To_One.Answer_Bi;
import One_To_One.Question_Bi;

public class MainClass {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		Question_FetchType question=new Question_FetchType();
		question.setQuestionid(103);
		question.setQuestion("what is java");
		Answer_FetchType answer =new Answer_FetchType();
		answer.setAnswer_id(201);
		answer.setAnswer("java is programing lang");
		answer.setQuestion(question);
		Answer_FetchType answer2 =new Answer_FetchType();
		answer2.setAnswer_id(102);
		answer2.setAnswer("java is Computer lang");
		answer2.setQuestion(question);
		
		List<Answer_FetchType> list=new ArrayList<Answer_FetchType>();
		list.add(answer2);
		list.add(answer);
		question.setAnswerr(list);
		
		
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(question);
//		session.save(answer);
//		session.save(answer2);
//		session.save(question1);
		tx.commit();
		
	}
}
