package Many_To_Many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Answer_MTM {
	 @Id
		private int Answer_id;
		
		private String answer;
		
		@ManyToMany(cascade = CascadeType.ALL, mappedBy = "answerr")
		private List<Question_MTM> question;

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

		public List<Question_MTM> getQuestion() {
			return question;
		}

		public void setQuestion(List<Question_MTM> question) {
			this.question = question;
		}

		
		
		
}
