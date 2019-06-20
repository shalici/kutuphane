package services;

import dao.KitapDAO;
import entity.Kitap;

import java.util.ArrayList;
import java.util.List;

public class KitapService implements IKitapService {

    private List<Kitap> kitapList = new ArrayList<>();
    private Long idGenerator = 1L;
    private static KitapService instance;
    private KitapDAO kitapDAO = new KitapDAO();

    private KitapService() {

    }

    public static KitapService getInstance() {
        if (instance==null){
            instance=new KitapService();
        }
        return instance;
    }

    @Override
    public void kaydet(Kitap kitap) {
        if (kitap!=null){
            kitapDAO.kaydet(kitap);
//            Kitap yeniKitap=new Kitap();
//            yeniKitap.setId(idGenerator);
//            yeniKitap.setTur(kitap.getTur());
//            yeniKitap.setSayfaSayisi(kitap.getSayfaSayisi());
//            yeniKitap.setAdi(kitap.getAdi());
//            yeniKitap.setEkleme_tarihi(kitap.getEkleme_tarihi());
//            yeniKitap.setBasimYili(kitap.getBasimYili());
//            yeniKitap.setYayinEvi(kitap.getYayinEvi());
//            yeniKitap.setEkul(kitap.getEkul());
//
//            idGenerator++;
//
//            kitapList.add(yeniKitap);

        }else {
            System.out.println("Hata");
        }
    }

    public void onGetir(Kitap kitap){
        if (kitapList!=null){
            kitapDAO.findAll();
        }else {

            System.out.println("Liste boş");
        }
    }



    @Override
    public List<Kitap> kitapListesiGetir() {
        return kitapDAO.findAll();
    }
}

