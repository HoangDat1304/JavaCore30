package dao;

import model.Ticket;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class TicketDao implements TaskDao {
    public List<Ticket> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List<Ticket> listTicket = session.createQuery("from VE_TAU").list();
            session.getTransaction().commit();
            return listTicket;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public boolean addNew() {
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Ticket ticket = new Ticket();
        ticket.nhapTicket();
        try {
            session1.beginTransaction();
            session1.save(ticket);
            session1.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session1.close();
        }
        return false;
    }
}



