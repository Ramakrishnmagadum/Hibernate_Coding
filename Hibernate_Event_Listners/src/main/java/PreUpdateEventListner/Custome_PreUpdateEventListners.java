package PreUpdateEventListner;

import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;


//The PreUpdateEventListener in Hibernate is an interface that allows you to intercept the event that occurs just before an entity 
//is updated in the database.
public class Custome_PreUpdateEventListners implements PreUpdateEventListener {

	@Override
	public boolean onPreUpdate(PreUpdateEvent event) {
		System.out.println("update operation excuting");
		return false;
	}


}