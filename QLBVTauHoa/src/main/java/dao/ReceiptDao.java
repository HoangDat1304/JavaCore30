package dao;

import model.Receipt;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class ReceiptDao {
    public List<Receipt> getAllReceipt() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List<Receipt> purchases = session.createQuery(" from HOA_DON ").list();
            session.getTransaction().commit();
            return purchases;
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return null;
    }

    public static boolean addNewReceipt() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Receipt receipt = new Receipt();
        try {
            session.beginTransaction();
            session.save(receipt);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return false;
    }

}
