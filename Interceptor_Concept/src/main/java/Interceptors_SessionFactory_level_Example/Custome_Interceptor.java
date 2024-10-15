package Interceptors_SessionFactory_level_Example;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class Custome_Interceptor extends EmptyInterceptor {

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
	System.out.println("before saving method  called");
	System.out.println(entity);
	System.out.println(id);//this is primary key value
	
		return super.onSave(entity, id, state, propertyNames, types);
	}
}
