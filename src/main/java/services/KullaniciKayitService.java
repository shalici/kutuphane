package services;

import dao.KullaniciDAO;
import entity.KullaniciKayit;

import java.util.ArrayList;
import java.util.List;

public class KullaniciKayitService implements IKullaniciKayitService {

    private List<KullaniciKayit> kullaniciKayitList = new ArrayList<KullaniciKayit>();
    private Long idGenerator=1L;
    private static KullaniciKayitService instance;
    private KullaniciDAO kullaniciDAO = new KullaniciDAO();

    public KullaniciKayitService(){

    }

    public static KullaniciKayitService getInstance() {
        if(instance==null){
            instance=new KullaniciKayitService();
        }
        return instance;
    }

    public void kaydet(KullaniciKayit kullaniciKayit){
        if(kullaniciKayit !=null){
            kullaniciDAO.kaydet(kullaniciKayit);
        }
    }

    public List<KullaniciKayit> kullaniciListesiGetir(){
        return kullaniciDAO.findAll();
    }

}
