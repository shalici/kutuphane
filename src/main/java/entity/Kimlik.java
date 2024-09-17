package entity;

import javax.persistence.*;
import java.util.Date;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "kimlik")
public class Kimlik extends BaseEntity{

    @Column(name = "adi_soyadi",nullable = false, length = 50)
    private String adiSoyadi;
    @Temporal(TemporalType.DATE)
    @Column(name = "dogum_tarihi",nullable = false)
    private Date dogumTarihi;
    @Column(name = "tc_kimlik_no",nullable = false, length = 11)
    private String tcKimlikNo;
    @Column(name = "adres")
    private String adres;
    @Column(name = "tel_no",nullable = false,length = 16)
    private String telefon_no;

    public Kimlik(String adiSoyadi, Date dogumTarihi, String tcKimlikNo, String adres, String telefon_no) {
        this.adiSoyadi = adiSoyadi;
        this.dogumTarihi = dogumTarihi;
        this.tcKimlikNo = tcKimlikNo;
        this.adres = adres;
        this.telefon_no = telefon_no;
    }

    public Kimlik() {

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

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon_no() {
        return telefon_no;
    }

    public void setTelefon_no(String telefon_no) {
        this.telefon_no = telefon_no;
    }
}