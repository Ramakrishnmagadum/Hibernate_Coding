package PostUpdateEventListner;

import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;

//Post-Update Event: Specifically, the PostUpdateEventListener is triggered after an entity has been updated in the database. 
//                   This means the update operation has been completed successfully.
public class Custome_PostUpdateEventListners implements PostUpdateEventListener {

//     ---------- 	Purpose of requiresPostCommitHandling:  ------------
//Transaction Safety:If your listener needs to perform actions that depend on the successful completion of the transaction 
//	                 (e.g., sending notifications, updating other systems, etc.), you might return true from this method.
//	              This ensures that those actions occur only after the transaction is committed, preventing issues related to partial updates or rollbacks.
//
//Performance Considerations: 
//	                      Returning false can improve performance because it indicates that the listener does not need to wait for the transaction commit.
//	                      If the listener's logic is lightweight and does not depend on the transaction's success, it can be executed immediately
	@Override
	public boolean requiresPostCommitHanding(EntityPersister persister) {
		System.out.println("handling.......");
		return true;
	}

	@Override
	public void onPostUpdate(PostUpdateEvent event) {
		System.out.println("post update operation excuting.......");
	}
}

//Example Usage:
//If your listener just logs changes or performs simple updates that do not rely on the transaction's state, you can safely return false:
//
//java
//@Override
//public boolean requiresPostCommitHandling(EntityPersister persister) {
//    return false; // Immediate handling is sufficient
//}

//
//However, if your listener sends notifications to an external system or modifies other entities based on the updated entity, 
//returning true ensures that those actions happen only after the commit:
//
//@Override
//public boolean requiresPostCommitHandling(EntityPersister persister) {
//    return true; // Actions depend on the transaction being committed
//}