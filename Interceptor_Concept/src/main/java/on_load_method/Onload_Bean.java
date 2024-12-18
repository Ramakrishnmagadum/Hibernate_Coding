package on_load_method;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Onload_Bean {
	@Id
	int id;

	String std_name;

	int marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Onload_Bean [id=" + id + ", std_name=" + std_name + ", marks=" + marks + "]";
	}
	
}
