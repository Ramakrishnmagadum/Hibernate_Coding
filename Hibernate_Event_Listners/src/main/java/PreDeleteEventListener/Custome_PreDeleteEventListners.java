package PreDeleteEventListener;

import org.hibernate.event.spi.PreDeleteEvent;
import org.hibernate.event.spi.PreDeleteEventListener;

//The PreDeleteEventListener in Hibernate is an interface that allows you to intercept the event that occurs right before an entity 
//is deleted from the database. 
public class Custome_PreDeleteEventListners implements PreDeleteEventListener {

	@Override
	public boolean onPreDelete(PreDeleteEvent event) {
		System.out.println("pre deleting operation executing...");
		return false;
	}

}


