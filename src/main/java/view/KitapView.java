package view;

import entity.Kategori;
import entity.Kitap;
import org.primefaces.event.SelectEvent;
import services.KitapService;
import sun.misc.Cleaner;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean
public class KitapView {

    private Kitap kitap;
    private KitapService kitapService;
    private List<Kitap> kitapList;
    private Map<Integer,String> tur;
    private Map<Integer,String> turMap;
    private String turKey;


    @PostConstruct
    public void init(){
        kitap=new Kitap();
        kitapService=KitapService.getInstance();
        kitapList=new ArrayList<>();

        turMap=new HashMap<>();
        turMap.put(1,"Aksiyon");
        turMap.put(2,"Ders");
        turMap.put(3,"Dram");
        turMap.put(4,"Bilim Kurgu");
        turMap.put(5,"Korku");
        turMap.put(6,"Gerilim");
        turMap.put(7,"Fantastik");

        for (Map.Entry<Integer,String> entry:turMap.entrySet()){
            entry.getKey();
            entry.getValue();
        }



    }

    public void onKaydet() {
        if (kitap.getAdi() != null) {
            kitapService.kaydet(kitap);

            kitapList = kitapService.kitapListesiGetir();
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage("Kayıt islemi Basarili..", null));


        } else {
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage("Kayıt islemi basarisiz..Zorunlu alanları kontrol ediniz.", null));
        }
    }


    public void onGetir() {
        if (kitap.getAdi() == null) {
            kitapService.kitapListesiGetir();
            kitapService.onGetir((Kitap) kitapList);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Liste getirilmiştir.", null));
        }
    }




    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public KitapService getKitapService() {
        return kitapService;
    }

    public void setKitapService(KitapService kitapService) {
        this.kitapService = kitapService;
    }

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }

    public Map<Integer, String> getTur() {
        return tur;
    }

    public void setTur(Map<Integer, String> tur) {
        this.tur = tur;
    }

    public Map<Integer, String> getTurMap() {
        return turMap;
    }

    public void setTurMap(Map<Integer, String> turMap) {
        this.turMap = turMap;
    }

    public String getTurKey() {
        return turKey;
    }

    public void setTurKey(String turKey) {
        this.turKey = turKey;
    }
}