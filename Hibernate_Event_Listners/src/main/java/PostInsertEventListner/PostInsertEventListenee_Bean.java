package PostInsertEventListner;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PostInsertEventListenee_Bean {

	@Id
	int id;
	
	String name;
	String sur_name;
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
	public String getSur_name() {
		return sur_name;
	}
	public void setSur_name(String sur_name) {
		this.sur_name = sur_name;
	}
	
}
