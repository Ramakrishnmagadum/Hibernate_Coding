package Embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	private String course;
	private String Duration;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		Duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	
}
