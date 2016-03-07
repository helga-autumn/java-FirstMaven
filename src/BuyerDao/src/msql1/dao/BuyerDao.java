package msql1.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import msql1.Buyer;

public class BuyerDao {
    private SessionFactory factory;


    public SessionFactory getFactory() {
        return factory;
    }
    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    public void Buyer(Buyer buyer) {
        Session s = factory.openSession();
        s.beginTransaction();
        s.save(buyer);
        s.getTransaction().commit();
        s.close();
    }

    @SuppressWarnings("unchecked")
    public List<Buyer> getAllAuthors() {
        Session s = factory.openSession();
        return s.createQuery("from Buyer").list();
}
