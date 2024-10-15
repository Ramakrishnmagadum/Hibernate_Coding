package Criteria_API;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import HQL_Query.paginationTable;

public class Restrictions_Example {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		// Greater then ">"
//		Criteria c=s.createCriteria(paginationTable.class);
//		c.add(Restrictions.gt("id", 90));
//	List<paginationTable> list=c.list();
//	for(paginationTable list2:list)
//	{
//	    System.out.println(list2.getId()+" - "+ list2.getName()+" - "+ list2.getSurname());
//	 }

		// Lesser then "<"
//		Criteria c=s.createCriteria(paginationTable.class);
//		c.add(Restrictions.lt("id", 90));
//	List<paginationTable> list=c.list();
//	for(paginationTable list2:list)
//	{
//	    System.out.println(list2.getId()+" - "+ list2.getName()+" - "+ list2.getSurname());
//	 }

		// equal to "="
//		Criteria c = s.createCriteria(paginationTable.class);
//		c.add(Restrictions.eq("id", 90));
//		List<paginationTable> list = c.list();
//		for (paginationTable list2 : list) {
//			System.out.println(list2.getId() + " - " + list2.getName() + " - " + list2.getSurname());
//		}
		
		
		//between 
//		Criteria c = s.createCriteria(paginationTable.class);
//		c.add(Restrictions.between("id", 90, 94));
//		List<paginationTable> list = c.list();
//		for (paginationTable list2 : list) {
//			System.out.println(list2.getId() + " - " + list2.getName() + " - " + list2.getSurname());
//		}
		
		//like operater
		Criteria c = s.createCriteria(paginationTable.class);
		c.add(Restrictions.like("surname", "%Name%"));
		List<paginationTable> list = c.list();
		for (paginationTable list2 : list) {
			System.out.println(list2.getId() + " - " + list2.getName() + " - " + list2.getSurname());
		}
		
		//ilike Operater
//		Criteria c = s.createCriteria(paginationTable.class);
//		c.add(Restrictions.ilike("surname", "%Name%"));
//		List<paginationTable> list = c.list();
//		for (paginationTable list2 : list) {
//			System.out.println(list2.getId() + " - " + list2.getName() + " - " + list2.getSurname());
//		}

	}

}
