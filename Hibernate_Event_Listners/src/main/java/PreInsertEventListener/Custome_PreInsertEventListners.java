package PreInsertEventListener;

import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreInsertEventListener;

public class Custome_PreInsertEventListners implements PreInsertEventListener {

	@Override
	public boolean onPreInsert(PreInsertEvent event) {
		System.out.println("Before Inserting the data it will excute the this code...");
		System.out.println(event.getEntity());
		System.out.println(event.getEntityName());
		System.out.println(event.getId());

		for (Object state : event.getState()) {
			System.out.println(state);
		}
		System.out.println(event.getIdentifier());// id

		System.out.println(event.getPersister().getEntityName());
		System.out.println(event.getPersister().getIdentifierPropertyName());
		System.out.println(event.getPersister().getMappedClass());
		System.out.println(event.getPersister().getRootEntityName());
		System.out.println(event.getPersister().getPropertyNames().toString());

		return false;
	}

}

//The PreInsertEvent class in Hibernate is part of the event system that allows you to hook into the lifecycle of entity operations, specifically before an entity is inserted into the database.
//This class provides context and information about the entity being inserted, making it useful for implementing custom behavior in response to insert actions.

//Overview of PreInsertEvent
//         Purpose: The primary purpose of PreInsertEvent is to serve as a notification to listeners that an entity is about to be persisted (inserted) into the database.
//                  It allows you to execute logic just before the insertion takes place.
//                  Key Components of PreInsertEvent
//
// Constructor     :The PreInsertEvent is typically instantiated internally by Hibernate when an insert operation is triggered. You usually don't create this object yourself; instead, 
//                  you implement a listener that responds to the event.
//
//Methods:
//getEntity() Method
//        Return Type : Object
//        Description : This method returns the entity instance that is about to be inserted. This allows you to access the entity's properties and perform any necessary logic based on its state.
//
//getPersister() Method
//       Return Type: EntityPersister
//       Description: This method returns the EntityPersister associated with the entity. The EntityPersister provides metadata about the entity, including its mapping, 
//                    identifiers, and other relevant information.
