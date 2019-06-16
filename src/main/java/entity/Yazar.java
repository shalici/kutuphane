package entity;

import enums.Tur;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlEnumValue;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "yazar")
public class Yazar extends BaseEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "adi")
    private String adi;
    @Column(name = "soyadi")
    private String soyadi;
    @Column(name = "adi_soyadi")
    private String adi_soyadi;
    @Column(name = "tur")
    private String tur;


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

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getAdi_soyadi() {
        return adi_soyadi;
    }

    public void setAdi_soyadi(String adi_soyadi) {
        this.adi_soyadi = adi_soyadi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}