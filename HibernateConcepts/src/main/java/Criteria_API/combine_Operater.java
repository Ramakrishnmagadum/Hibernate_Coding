package Criteria_API;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import HQL_Query.paginationTable;

public class combine_Operater {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		// This will simply return every object that
        // corresponds to the GeekEmployee class.
        Criteria geekEmployeeCriteria = s.createCriteria(paginationTable.class);
 
        // Here 2 expectations are there one with salary and
        // second one is name. Both are expected to be
        // present. Let us see how to do that
        Criterion salaryExpectation = Restrictions.gt("id", 70);
 
        Criterion nameExpectation = Restrictions.ilike("surname", "%1%");
        // As we are combining 2 conditions and that two
        // logically And, we need to add as Restrictions.and
        // To get records matching with AND conditions we
        // need to give below way
        LogicalExpression logicalAndExpression = Restrictions.and(salaryExpectation,  nameExpectation);
        geekEmployeeCriteria.add(logicalAndExpression);
		
        // As a list we can collect them and can iterate
        List geekEmployeeList = geekEmployeeCriteria.list();
 
        for (Iterator iterator = geekEmployeeList.iterator();   iterator.hasNext();) {
        	paginationTable employee = (paginationTable)iterator.next();
    		System.out.println(employee.getId() + " - " + employee.getName() + " - " + employee.getSurname());
       }	
	}
}