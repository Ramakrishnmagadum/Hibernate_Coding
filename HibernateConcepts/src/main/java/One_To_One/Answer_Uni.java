package One_To_One;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer_Uni {
     @Id
	private int Answer_id;
	
	private String answer;

	

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
