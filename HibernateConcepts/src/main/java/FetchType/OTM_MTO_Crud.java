package FetchType;

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
	
//	FetchType :Lazy  --it will not fetch or will not fire select  the answer_FtechType object
	
//	select question_f0_.question_id as question1_7_0_, question_f0_.question as question2_7_0_ 
//      from Question_FetchType question_f0_ where  question_f0_.question_id=?
   
	
//	FetchType :Eagear  --it will  fetch or will  fire select  the answer_FtechType object
	
//	   select  question_f0_.question_id as question1_7_0_, question_f0_.question as question2_7_0_,
//       answerr1_.question_question_id as question3_1_1_, answerr1_.Answer_id as Answer_i1_1_1_, answerr1_.Answer_id as Answer_i1_1_2_,
//       answerr1_.answer as answer2_1_2_, answerr1_.question_question_id as question3_1_2_ 
//       from   Question_FetchType question_f0_ 
//       left outer join
//       Answer_FetchType answerr1_ 
//           on question_f0_.question_id=answerr1_.question_question_id 
//      where  question_f0_.question_id=? 
//      order by  answerr1_.Answer_id asc
    		
	Question_FetchType ques=session.get(Question_FetchType.class, 103);
	System.out.println(ques.getQuestionid());
	
	
}

}
