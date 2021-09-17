import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Demo {
    public static void main(String[] args) {
        Student student = new Student("S001", "Nimal", "Colombo", "011");
        //class
        Configuration configuration=new Configuration() ;
        //interface
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        //interface
        Session session=SessionFactory.openSession();
        session.save(student);
    }
}

