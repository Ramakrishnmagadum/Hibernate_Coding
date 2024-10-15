package One_To_One;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer_Bi {
     @Id
	private int Answer_id;
	
	private String answer;
	
//	if we give only this much then , it will create refrence coloumn in the this tableeeee
//	@OneToOne(cascade = CascadeType.ALL
	
	//if we want bi -directional mapping and donot want refrence column in this table then use mappeBY and here give 
//	String as --refrence column name in the parent 
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "answerr")
	private Question_Bi question;
	
	

	public Question_Bi getQuestion() {
		return question;
	}

	public void setQuestion(Question_Bi question) {
		this.question = question;
	}

	public int getAnswer_id() {
		return Answer_id;
	}

	public void setAnswer_id(int answer_id) {
		Answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
