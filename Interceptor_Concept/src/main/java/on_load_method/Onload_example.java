package on_load_method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Onload_example {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.setInterceptor(new Onload_interceptor());
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		for(int i=0;i<5;i++){
			Onload_Bean bean=new Onload_Bean();
			Transaction tx=s.beginTransaction();
			bean.setId(i);
			bean.setMarks(i*10);
			bean.setStd_name("name - "+i);
			s.save(bean);
			tx.commit();
		}
		s.close();//i am closing because , after inserting data , its also stroing in cache so ,it not firing query to get data ....
		Session s2=sf.openSession();
		Onload_Bean data=s2.load(Onload_Bean.class, 1);
		System.out.println(data.toString());		
	}
}
