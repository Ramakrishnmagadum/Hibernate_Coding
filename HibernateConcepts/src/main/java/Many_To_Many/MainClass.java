package Many_To_Many;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
		Question_MTM question=new Question_MTM();
		question.setQuestionid(101);
		question.setQuestion("what is java");
		Question_MTM question1=new Question_MTM();
		question1.setQuestionid(102);
		question1.setQuestion("what is Python");
		Question_MTM question2=new Question_MTM();
		question2.setQuestionid(103);
		question2.setQuestion("what is C++");
		
		
		List<Question_MTM> queslist=new ArrayList<Question_MTM>();
		queslist.add(question1);
		queslist.add(question);
		//201  -101 and 102
		
		Answer_MTM answer =new Answer_MTM();
		answer.setAnswer_id(201);
		answer.setAnswer("java is programing lang");
		answer.setQuestion(queslist);
		
		//202  -101 and 102
		Answer_MTM answer2 =new Answer_MTM();
		answer2.setAnswer_id(202);
		answer2.setAnswer("java is Computer lang");
		answer2.setQuestion(queslist);
		
		
		Answer_MTM answer3 =new Answer_MTM();
		answer3.setAnswer_id(203);
		answer3.setAnswer("java is programing lang");
		
		
		Answer_MTM answer4 =new Answer_MTM();
		answer4.setAnswer_id(204);
		answer4.setAnswer("java is Computer lang");
		
	
		
		//102 -201 and 202
		List<Answer_MTM> list=new ArrayList<Answer_MTM>();
		list.add(answer);
		list.add(answer2);
		question2.setAnswerr(list);
		
		//101 --203 and 204
		List<Answer_MTM> list2=new ArrayList<Answer_MTM>();
		list2.add(answer3);
		list2.add(answer4);
		question.setAnswerr(list2);
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(question1);
		session.save(question2);

		session.save(question);
		tx.commit();
		
	}
}
