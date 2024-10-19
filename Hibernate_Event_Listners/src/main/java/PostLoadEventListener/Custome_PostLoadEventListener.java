package PostLoadEventListener;

import org.hibernate.event.spi.PostLoadEvent;
import org.hibernate.event.spi.PostLoadEventListener;
import org.hibernate.event.spi.PreLoadEvent;
import org.hibernate.event.spi.PreLoadEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;

//This event is triggered right before an entity is loaded from the database into the Hibernate session. It provides an opportunity to perform 
//actions just before the entity is fetched.
public class Custome_PostLoadEventListener implements PostLoadEventListener {

	@Override
	public void onPostLoad(PostLoadEvent event) {
	System.out.println("post load operation executing.....");
		
	}


}