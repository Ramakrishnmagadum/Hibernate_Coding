package Criteria_API;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import HQL_Query.paginationTable;

public class Aggregation_Example {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
	
	
		 // This will simply return every object that
        // corresponds to the paginationTable class.
        Criteria geekEmployeeCriteria  = session.createCriteria(paginationTable.class);
 
        // Get total number of records by using rowcount
        geekEmployeeCriteria.setProjection( Projections.rowCount());
        List employeeRowCount = geekEmployeeCriteria.list();
 
        System.out.println("Total row Count: " + employeeRowCount.get(0));
 
        
        
        // Getting sum(salary)
        geekEmployeeCriteria.setProjection( Projections.sum("id"));
        List totalSalary = geekEmployeeCriteria.list();
 
        System.out.println("Total id of GeekEmployees: " + totalSalary.get(0));
 
        
        
        // Getting average(salary)
        geekEmployeeCriteria.setProjection( Projections.avg("id"));
        List averageSalary = geekEmployeeCriteria.list();
        System.out.println( "Average id of GeekEmployees: "+ averageSalary.get(0));
 
        
        // Getting max(salary)
        geekEmployeeCriteria.setProjection(  Projections.max("id"));
        List maxSalary = geekEmployeeCriteria.list();
        System.out.println(  "Maximum id among GeekEmployees: " + maxSalary.get(0));
        
        
 
        // Getting min(salary)
        geekEmployeeCriteria.setProjection( Projections.min("id"));
        List minSalary = geekEmployeeCriteria.list();
        System.out.println(  "Minimum id among GeekEmployees: "  + minSalary.get(0));
	}
}
