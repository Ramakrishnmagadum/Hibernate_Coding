package Save_Method;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class save_Interceptor extends EmptyInterceptor {

	// on save method is called just before the saving or inserting the data into
	// Database
	// we can modify the values also
	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		System.out.println("Entity name :-" + entity);
		System.out.println("unique key or primary key of the Entity :- " + id);
		for (Object state1 : state)// this state wont include the primary key value
		{
			System.out.println("values  :-  " + state1.toString());
		}

		for (String variabel : propertyNames)// this propertyNames wont include the primary key of entity..........
		{
			System.out.println("variables  :-  " + variabel);

		}

		// updating the values before saving into DB
		for (int i = 0; i < state.length; i++) {
			if(propertyNames[i].equals("name")) {
				state[i]="prashant";
				System.out.println(state[i]);
				System.out.println("inside");
			}
		}
		return true ;//if you updated something and it should replacte in DB means you should return true ......
//		return super.onSave(entity, id, state, propertyNames, types);
	}

	// paramters
	// 1. entity : this is object we are going to save in DB
	// 2. id : The unique identifier of the entity, (primary key)
	// which may be null if the entity is transient and does not yet have an
	// identifier.
	// 3. state : An array of the current state of the entity's properties.
	// This is useful for examining or modifying the values that will be saved.
	// 4. propertyNames : An array of property names corresponding to the state
	// array.
	// This allows you to know which properties are being saved.
	// 5.

//-------------	What Happens During Execution -------------------
//1.	When you save a new entity using a session, Hibernate generates the SQL statement for the save operation.
//2.	Before executing the SQL, Hibernate calls the onSave method of the registered interceptor.
//3.	Inside the onSave method, you can log the operation, modify the entity state, or enforce business rules.
//	    means we can updated the values in entity before saving the data
//4     The method returns a boolean. If you return true, 
//	    Hibernate will consider that you have handled the save operation and will not proceed with the default save 
//	    logic. If you return false, Hibernate will continue with its normal save process.

}
