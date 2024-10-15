package One_To_Many;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer_OTM {
	 @Id
		private int Answer_id;
		
		private String answer;
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Question_OTM question;

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

		public Question_OTM getQuestion() {
			return question;
		}

		public void setQuestion(Question_OTM question) {
			this.question = question;
		}

		@Override
		public String toString() {
			return "Answer_OTM [Answer_id=" + Answer_id + ", answer=" + answer + ", question=" + question + "]";
		}
		
		
}
