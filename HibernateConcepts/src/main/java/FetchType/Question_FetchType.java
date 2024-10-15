package FetchType;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Question_FetchType {

	@Id
	@Column(name = "question_id")
	private int questionid;

	private String question;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question" ,fetch = FetchType.EAGER)
	@OrderBy("Answer_id ASC")
	private List<Answer_FetchType> answerr;

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

	public List<Answer_FetchType> getAnswerr() {
		return answerr;
	}

	public void setAnswerr(List<Answer_FetchType> answerr) {
		this.answerr = answerr;
	}

	@Override
	public String toString() {
		return "Question_OTM [questionid=" + questionid + ", question=" + question + ", answerr=" + answerr + "]";
	}

	
	
	
}
