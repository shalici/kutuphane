package view;

import entity.Kimlik;
import entity.KullaniciKayit;
import services.KullaniciKayitService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
public class KullaniciKayitView {

    private KullaniciKayit kullaniciKayit;
    private KullaniciKayitService kullaniciService;
    private List<KullaniciKayit> kullaniciKayitList;
    private Kimlik kimlik;


    @PostConstruct
    public void init(){

        kullaniciKayit = new KullaniciKayit();
        kullaniciService = new KullaniciKayitService();
        kullaniciKayitList = new ArrayList<>();
        kimlik = new Kimlik();
    }



    public void kaydet()

    {

        if (kullaniciKayit.getKullanici_adi() != null && kullaniciKayit.getPassword()==kullaniciKayit.getPassword_again()) {
            kullaniciService.kaydet(kullaniciKayit);


            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kayıt işlemi başarılı.", null));
        } else {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kullanıcı adı kullanılıyor veya şifre hatalı tekrar deneyiniz..", null));

        }
    }

    public void giris() {
        if (kullaniciKayit.getKullanici_adi() != null && kullaniciKayit.getKullanici_adi()!=kullaniciKayit.getKullanici_adi()) {
            kullaniciService.giris(kullaniciKayit);
        }else FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Kullanıcı Adı hatalı",null));
    }

    public KullaniciKayit getKullaniciKayit() {
        return kullaniciKayit;
    }

    public void setKullaniciKayit(KullaniciKayit kullaniciKayit) {
        this.kullaniciKayit = kullaniciKayit;
    }

    public KullaniciKayitService getKullaniciService() {
        return kullaniciService;
    }

    public void setKullaniciService(KullaniciKayitService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    public List<KullaniciKayit> getKullaniciKayitList() {
        return kullaniciKayitList;
    }

    public void setKullaniciKayitList(List<KullaniciKayit> kullaniciKayitList) {
        this.kullaniciKayitList = kullaniciKayitList;
    }

    public Kimlik getKimlik() {
        return kimlik;
    }

    public void setKimlik(Kimlik kimlik) {
        this.kimlik = kimlik;
    }


}