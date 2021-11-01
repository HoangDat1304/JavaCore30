package dao;

import model.Customer;
import model.Receipt;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class CustomerDao implements TaskDao {
    public List<Customer> getAll() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List<Customer> customers = session.createQuery("from NGUOI_MUA_VE").list();
            session.getTransaction().commit();
            return customers;
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return null;
    }

    public boolean addNew() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Customer customer = new Customer();
        customer.nhapCustomer();
        try {
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return false;
    }
}
