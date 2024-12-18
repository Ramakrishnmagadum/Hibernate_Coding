package onFlushDirty_Method;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class onFlushDirty_Interceptor extends EmptyInterceptor {
//	The onFlushDirty() method in Hibernate is part of the Interceptor interface and is called when an entity that is already persistent is detected as
//	"dirty," meaning it has been modified since it was last saved to the database	
	
//	this will get called when we updating the values ,before storing the updated values into DB , this method will get called......
	@Override
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		System.out.println("before updating values ");
		
		//updated values we can get , by comparing currentstate and previousstate and we modify here alsooooo......
		for(int i=0;i<currentState.length;i++)
		{
			if(currentState[i]!=previousState[i]) {
				currentState[i]="updated"+currentState[i];
			}
		}
		return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
	}
	
//	-----------  Parameters  -------------
//	entity       : The entity instance that is being updated.
//	id           : The identifier (primary key) of the entity being updated.
//	currentState : An array representing the current state of the entity (the values that are going to be saved).
//	previousState: An array representing the previous state of the entity (the values that were previously in the database).
//	propertyNames: An array of the names of the properties in the entity. This can help you correlate the values in the state arrays with their respective properties.

	
//	-----------------  Return Type  -----------
//	The method returns a boolean value:
//	Returning true indicates that the interceptor has modified the entity state, and Hibernate should proceed with the changes.
//	Returning false indicates that the interceptor did not modify the entity, and Hibernate should ignore the changes made in this session for this entity.

	
}
