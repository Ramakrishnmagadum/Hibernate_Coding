package sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentBean {
	@Id
private int id;
private String name;
public StudentBean() {
	super();
	// TODO Auto-generated constructor stub
}

public StudentBean(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "StudentBean [id=" + id + ", name=" + name + "]";
}

}
