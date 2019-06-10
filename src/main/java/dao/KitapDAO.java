package dao;


import entity.Kitap;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;


import java.util.List;


public  class KitapDAO extends BaseDAO {

    public void kaydet(Kitap kitap) {


        Transaction transaction = null;
        try {

            transaction = getSession().beginTransaction();
            getSession().save(kitap);


        } catch (HibernateException ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            transaction.commit();

        }

    }

    public  List<Kitap> findAll() {

        List<Kitap> kitapList = null;
        Transaction transaction = null;

        try {
            transaction = getSession().beginTransaction();

            kitapList = getSession().createQuery("from Kitap ", Kitap.class).list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {

        }
        return  kitapList;
    }
}
