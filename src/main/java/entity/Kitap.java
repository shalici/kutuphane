package entity;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "kitap")
public class Kitap extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Long id;
    @Column(name = "adi",nullable = true)
    private String adi;
    @Column(name = "yazar")
    private String yazar;
    @Column(name = "basim_yili",nullable = true)
    private String basimYili;
    @Column(name = "yayin_evi")
    private String yayinEvi;
    @Column(name = "sayfa_sayisi")
    private Integer sayfaSayisi;
    @Column(name = "tur")
    private String tur;

    private String findByAll;

    public Kitap() {
        this.adi = adi;
        this.yazar = yazar;
        this.basimYili = basimYili;
        this.yayinEvi = yayinEvi;
        this.sayfaSayisi= sayfaSayisi;
        this.tur = tur;
        this.findByAll = findByAll;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getBasimYili() {
        return basimYili;
    }

    public void setBasimYili(String basimYili) {
        this.basimYili = basimYili;
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public Integer getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(Integer sayfaSayifi) {
        this.sayfaSayisi = sayfaSayifi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}