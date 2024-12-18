package One_To_One;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question_uni {
	@Override
	public String toString() {
		return "Question_uni [questionid=" + questionid + ", question=" + question + ", answer=" + answerr + "]";
	}

	@Id
	@Column(name = "question_id")
	private int questionid;

	private String question;
   
//	@OneToOne    -- if i give only this annotation without any other specification --it will ask to save both , if we trying to save only Question_Uni 
//	it wont save , 
	  
//	@OneToOne(cascade = CascadeType.ALL	)  if i am mentioning this CascadeType means if we save only parent entity it will save both parent and child entity 
//no need to save seperate seperate....	
	
	@OneToOne(cascade = CascadeType.ALL	) 
	@JoinColumn(name="ans")
	private Answer_Uni answerr;

	public Question_uni() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question_uni(int questionid, String question, Answer_Uni answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answerr = answer;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer_Uni getAnswer() {
		return answerr;
	}

	public void setAnswer(Answer_Uni answer) {
		this.answerr = answer;
	}
}
