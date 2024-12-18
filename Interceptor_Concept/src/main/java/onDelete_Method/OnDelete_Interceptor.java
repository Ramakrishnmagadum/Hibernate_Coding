package onDelete_Method;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class OnDelete_Interceptor extends EmptyInterceptor {

//	The onDelete() method in Hibernate Interceptors is another important hook that allows you to intercept the deletion of entities record from the database
//	this method will called ,before deleting entities record 
//	why we used this method ---before deleting any entity record , some conditions wanted check and those conditions are satisfied then it wont allow to delete this Entity
	
	@Override
	public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		System.out.println("before deleting the entity this method will call");
		
		// Example: Enforce a rule (e.g., prevent deletion of an entity if a condition is met)
        // if (someCondition) {
        //     throw new SomeBusinessException("Deletion not allowed.");
        // }
		super.onDelete(entity, id, state, propertyNames, types);
	}
	
//	 ----------- Use Cases --------------
//	Data Validation: Enforce business rules before allowing a deletion to occur (e.g., preventing the deletion of an entity  that is in use).
	
	
//	--------- Parameters  -----------
//	entity       : The entity instance that is being deleted.
//	id           : The identifier (primary key) of the entity that is being deleted.
//	currentState : An array representing the current state of the entity before deletion. This can provide context about the entity's properties.
//	propertyNames: An array of the names of the properties in the entity. This can help identify which properties correspond to the values in currentState.
}
