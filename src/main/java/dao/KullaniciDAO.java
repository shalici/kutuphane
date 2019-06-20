package dao;

import entity.KullaniciKayit;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import java.util.List;

public class KullaniciDAO extends BaseDAO {

    public void kaydet(KullaniciKayit kullaniciKayit) {


        Transaction transaction = null;
        try {

            transaction = getSession().beginTransaction();
            getSession().save(kullaniciKayit);


        } catch (HibernateException ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            transaction.commit();

        }

    }


    public List<KullaniciKayit> findAll(){
        List<KullaniciKayit> kullaniciKayitList = null;
        Transaction transaction = null;

        try{
            transaction = getSession().beginTransaction();

            //kullaniciKayitList = getSession().createQuery("from Kitap ",KullaniciKayit.class).list();
        } catch (HibernateException ex){
            ex.printStackTrace();
            transaction.rollback();
        } finally {

        }
        return kullaniciKayitList;

    }

    public void giris(KullaniciKayit kullaniciKayit) {


        Transaction transaction = null;
        try {

            transaction = getSession().beginTransaction();
            getSession().save(kullaniciKayit);


        } catch (HibernateException ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            transaction.commit();

        }

    }


}