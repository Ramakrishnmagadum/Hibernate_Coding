package on_load_method;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class Onload_interceptor extends EmptyInterceptor {

//	The onLoad() method in Hibernate Interceptors is used to hook into the process of loading entities from the database. 4
//	It allows you to perform custom actions whenever an entity is loaded,

//	means --while getting data , before this method will invoke and we can modify the data before display 
//	for sensitive data --we can mask it before displaying the data

	@Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// present data
		for(Object state1:state){
			System.out.println(state1.toString());
		}

		// modifying the data
		for (int i = 0; i < state.length; i++) {
			if (propertyNames[i].equals("std_name")) {
				state[i] = "ramakrishna";
				System.out.println("value is updated from onload method");
			}
		}
		return true;
//	return super.onLoad(entity, id, state, propertyNames, types);
	}

//   ---------------  Parameters -------------
//entity       : The entity instance that is being loaded from the database. This is the actual object that Hibernate will return to your application.
//id           : The identifier of the entity being loaded. This is the primary key value that uniquely identifies the entity.
//state        : An array of the current state values of the entity. This contains the values of the properties of the entity as they exist in the database.
//propertyNames: An array of the names of the properties corresponding to the values in the state array.

// --------   How It Works in Practice   --------------
//Entity Loading: Whenever an entity is loaded from the database (e.g., via session.get(MyEntity.class, id)), the onLoad() method is called.
//Modification  : If the entity matches specific criteria (like being an instance of MyEntity), 
//                you can modify its state directly before it is returned to the application.
}
