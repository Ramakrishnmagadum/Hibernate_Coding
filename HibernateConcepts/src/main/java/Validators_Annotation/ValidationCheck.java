package Validators_Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.ConstraintViolation;
import java.util.Set;

public class ValidationCheck {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            // Set up Hibernate session
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
          
            // Create and populate entity
            Validators_Annotation bean = new Validators_Annotation();
            bean.setAge(20);
            bean.setUsername("1"); // This will trigger a validation error

            // Validate the bean without EL dependencies
            ValidatorFactory factory = Validation.byDefaultProvider()
                    .configure()
                    .messageInterpolator(new ParameterMessageInterpolator())
                    .buildValidatorFactory();
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<Validators_Annotation>> violations = validator.validate(bean);

            // Check for validation errors
            if (!violations.isEmpty()) {
                for (ConstraintViolation<Validators_Annotation> violation : violations) {
                    System.out.println(violation.getMessage());
                }
            } else {
                // Save the bean if there are no validation errors
                session.save(bean);
                transaction.commit();
                System.out.println("Entity saved successfully.");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback in case of an error
            }
            e.printStackTrace();
        } finally {
            // Close session and factory
            if (session != null) {
                session.close();
            }
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
}
