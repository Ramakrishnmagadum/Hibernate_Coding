package Embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentList {
    @Id
	private int studentid;
    
	private String name;
	
	private Certificate certi;

	public StudentList(int studentid, String name, Certificate certi) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.certi = certi;
	}

	public StudentList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	
}
