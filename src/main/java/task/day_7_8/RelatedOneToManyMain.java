package task.day_7_8;

import org.hibernate.Session;
import task.day_7_8.model.RelatedStudent;


public class RelatedOneToManyMain {
    public static void main(String[] args) {
        Session session= RelatedHibernateUtil.getSessionFactory().openSession();
//
//        Phone phone1=new Phone();
//        phone1.setIdphone(1L);
//        phone1.setNumber("6666");
//        phone1.setId_student(1L);
//
//        session.beginTransaction();
//        session.save(phone1);
//        session.getTransaction().commit();
//
//        Phone phone2=new Phone();
//        phone2.setIdphone(2L);
//        phone2.setNumber("+2809999");
//        phone2.setId_student(1L);
//
//        session.beginTransaction();
//        session.save(phone2);
//        session.getTransaction().commit();


        session.beginTransaction();
        RelatedStudent student = session.find(RelatedStudent.class,1L);
        System.out.println("readStudent : "+ student);
        session.getTransaction().commit();
    }
}
