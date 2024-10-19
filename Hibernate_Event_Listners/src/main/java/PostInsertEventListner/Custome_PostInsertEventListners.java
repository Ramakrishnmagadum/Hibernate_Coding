package PostInsertEventListner;

import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;


//The PostInsertEventListener in Hibernate is an interface that allows you to hook into the event that occurs immediately after 
//an entity has been successfully inserted into the database.

public class Custome_PostInsertEventListners implements PostInsertEventListener {

	

	@Override
	public void onPostInsert(PostInsertEvent event) {
		System.out.println("Post Insert Operations");
		
	}

//	 It determines whether the listener requires post-commit handling. If this method returns true, it indicates that the listener needs to perform its operations after the transaction has been committed. 
//	This can be useful for actions that rely on the transaction being fully completed.
	@Override
	public boolean requiresPostCommitHanding(EntityPersister persister) {
		// TODO Auto-generated method stub
		return false;
	}
}