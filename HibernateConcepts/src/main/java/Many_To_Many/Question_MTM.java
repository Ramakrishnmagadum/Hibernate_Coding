package Many_To_Many;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;

@Entity
public class Question_MTM {

	@Id
	@Column(name = "question_id")
	private int questionid;

	private String question;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ques_ans_MTM", 
	joinColumns = {@JoinColumn(name="ques_id")},
	inverseJoinColumns = {@JoinColumn(name="ans_id")})
	private List<Answer_MTM> answerr;

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

	public List<Answer_MTM> getAnswerr() {
		return answerr;
	}

	public void setAnswerr(List<Answer_MTM> answerr) {
		this.answerr = answerr;
	}

	@Override
	public String toString() {
		return "Question_OTM [questionid=" + questionid + ", question=" + question + ", answerr=" + answerr + "]";
	}

	
	
	
}
