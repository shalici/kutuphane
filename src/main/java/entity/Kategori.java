package entity;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "kategori")
public class Kategori extends BaseEntity {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "tur")
    private String tur;
    @Column(name = "yazar")
    private String yazar;
    @Column(name = "basim_yili")
    private String basimYili;
    @JoinColumn(name = "yayin_evi")
    private String yayinEvi;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public Kategori(){

    }

    public Kategori(String tur, String yazar, String basimYili, String yayinEvi) {
        this.tur = tur;
        this.yazar = yazar;
        this.basimYili = basimYili;
        this.yayinEvi = yayinEvi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
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
}