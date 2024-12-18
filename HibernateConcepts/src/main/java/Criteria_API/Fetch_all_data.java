package Criteria_API;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HQL_Query.paginationTable;

public class Fetch_all_data {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	 // This will simply return every object that
    // corresponds to the GeekEmployee class.
    Criteria geekEmployeeCriteria = s.createCriteria(	paginationTable.class);
    
    
    // As a list we can collect them and can iterate
    List geekEmployeeList = geekEmployeeCriteria.list();
    
    
    for (Iterator iterator  = geekEmployeeList.iterator();   iterator.hasNext();) {
    	paginationTable employee = (paginationTable)iterator.next();
    	
       System.out.println(employee.getId()+" - "+ employee.getName()+" - "+ employee.getSurname());
    }
}
}
