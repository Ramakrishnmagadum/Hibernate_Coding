package PreLoadEventListener;

import org.hibernate.event.spi.PreLoadEvent;
import org.hibernate.event.spi.PreLoadEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;

//This event is triggered right before an entity is loaded from the database into the Hibernate session. It provides an opportunity to perform 
//actions just before the entity is fetched.
public class Custome_PreLoadEventListener implements PreLoadEventListener {

	@Override
	public void onPreLoad(PreLoadEvent event) {
		System.out.println("pre load operations executing........");
		
	}



}