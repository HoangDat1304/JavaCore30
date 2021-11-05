package dao;

import model.Student;
import org.hibernate.Session;
import util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;

public class StudentDao {
    public static List<Student> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List<Student> student = session.createQuery(" from student").list();
            session.getTransaction().commit();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public static  boolean addStudent (Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Student student = session.load(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return false;
    }

    public List<Student> getStudentName(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Query<Student> query = session.createQuery("from student where lower(fullname) like lower(to_char(concat(concat('%', :p_student_name), '%'))) ");
            query.setParameter("p_student_name", name);
            List<Student> student = query.getResultList();
            session.getTransaction().commit();
            return student;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> getStudentClassName(String className){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Query<Student> query = session.createQuery("from student where classname = :student_classname");
            query.setParameter("student_classname", className);
            List<Student> students = query.getResultList();
            session.getTransaction().commit();
            return students;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> getStudentMajor(String major){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Query<Student> query = session.createQuery("from student where major = :student_major");
            query.setParameter("student_major", major);
            List<Student> students = query.getResultList();
            session.getTransaction().commit();
            return students;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> getStudentHometown(String homeTown){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Query<Student> query = session.createQuery("from student where hometown = :student_hometown");
            query.setParameter("student_hometown", homeTown);
            List<Student> students = query.getResultList();
            session.getTransaction().commit();
            return students;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> getStudentGender(String gender){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Query<Student> query = session.createQuery("from student where gender = :student_gender");
            query.setParameter("student_gender", gender);
            List<Student> students = query.getResultList();
            session.getTransaction().commit();
            return students;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> getStudentAverageMark(double min, double max){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Query<Student> query = session.createQuery("from student where averagemark between :student_markMin and :student_markMax");
            query.setParameter("student_markMin", min);
            query.setParameter("student_markMax", max);
            List<Student> students = query.getResultList();
            session.getTransaction().commit();
            return students;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
