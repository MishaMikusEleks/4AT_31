package task.day_7_8;

import org.hibernate.Session;
import task.day_7_8.model.RelatedStudent;


public class RelatedHibernateMain {
    public static void main(String[] args) {
        Session session= RelatedHibernateUtil.getSessionFactory().openSession();

        //Create
        Long studentId=2L;
        Long id=2L;
//
//        RelatedStudent relatedStudent=new RelatedStudent();
//        relatedStudent.setName("student Name");
//        relatedStudent.setId_student(studentId);
//
//        session.beginTransaction();
//        session.save(relatedStudent);
//        session.getTransaction().commit();
//
//        RelatedAddress address=new RelatedAddress();
//        address.setCity("Lviv");
//        address.setBuilding(1);
//        address.setId_address(id);
//
//        session.beginTransaction();
//        session.save(address);
//        session.getTransaction().commit();

        //CRUD

        //Read
        session.beginTransaction();
        RelatedStudent student = session.find(RelatedStudent.class,studentId);
        System.out.println("readStudent : "+ student);
        session.getTransaction().commit();

    }
}
