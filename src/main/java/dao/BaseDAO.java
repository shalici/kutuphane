package dao;

import org.hibernate.Session;
import util.HibernateUtil;


public class BaseDAO {


    private Session session = HibernateUtil.getSession();
    public Session getSession() {
        return session;
    }
}
