package Interceptors_SessionFactory_level_Example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SessionFactory_level_Bean {

	@Id
	int id;
	
	String name;
	
	String surname ;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
