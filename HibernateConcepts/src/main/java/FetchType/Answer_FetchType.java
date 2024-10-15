package FetchType;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer_FetchType {
	 @Id
		private int Answer_id;
		
		private String answer;
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Question_FetchType question;

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

		public Question_FetchType getQuestion() {
			return question;
		}

		public void setQuestion(Question_FetchType question) {
			this.question = question;
		}
		
		
}
