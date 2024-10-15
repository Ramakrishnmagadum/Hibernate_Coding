package onPrepareStatement_method;

import org.hibernate.EmptyInterceptor;

public class onPrepareStatement_Interceptor extends EmptyInterceptor {
	
	
//	The onPrepareStatement method in Hibernate Interceptors is a powerful feature that allows you to 
//	intercept and modify SQL statements before they are executed.

	@Override
	public String onPrepareStatement(String sql) {
		System.out.println("sql query :- "+ sql);
		return super.onPrepareStatement(sql);
	}
	
//	---parameter
//	1.sql:  This is the SQL statement that is about to be executed. It's provided as a String, and you can read or modify it as needed.

	
//	---------  How It Works in Practice  ---------
//	Execution    :   When a Hibernate operation is performed (e.g., a query), the onPrepareStatement method is invoked everytime.
//	Modification :   If you decide to modify the SQL (like adding comments), the modified SQL is returned and executed.

	}
