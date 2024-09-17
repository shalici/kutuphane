package entity;

import org.hibernate.annotations.Tables;

import javax.persistence.*;
import java.util.Date;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "Kullanici")
public class KullaniciKayit extends BaseEntity {


    @Column(name = "kullanici")
    private String kullanici_adi;
    @Column(name = "sifre")
    private String password;
    @Column
    private String kimlik;

    private String password_again;

    public KullaniciKayit(String kullanici_adi, String password, String kimlik) {
        this.kullanici_adi = kullanici_adi;
        this.password = password;
        this.kimlik = kimlik;
    }

    public KullaniciKayit() {

    }

    public String getPassword_again() {
        return password_again;
    }

    public void setPassword_again(String password_again) {
        this.password_again = password_again;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public Date getEkleme_tarihi() {
        return super.getEkleme_tarihi();
    }

    @Override
    public void setEkleme_tarihi(Date ekleme_tarihi) {
        super.setEkleme_tarihi(ekleme_tarihi);
    }

    @Override
    public Date getDegistirme_tarihi() {
        return super.getDegistirme_tarihi();
    }

    @Override
    public void setDegistirme_tarihi(Date degistirme_tarihi) {
        super.setDegistirme_tarihi(degistirme_tarihi);
    }

    @Override
    public String getEkul() {
        return super.getEkul();
    }

    @Override
    public void setEkul(String ekul) {
        super.setEkul(ekul);
    }

    @Override
    public String getDkul() {
        return super.getDkul();
    }

    @Override
    public void setDkul(String dkul) {
        super.setDkul(dkul);
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }
}
