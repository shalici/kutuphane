package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id",nullable = false)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "etar")
    private Date ekleme_tarihi;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtar")
    private Date degistirme_tarihi;
    @Column(name = "ekul")
    private String ekul;
    @Column(name = "dkul")
    private String dkul;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEkleme_tarihi() {
        return ekleme_tarihi;
    }

    public void setEkleme_tarihi(Date ekleme_tarihi) {
        this.ekleme_tarihi = ekleme_tarihi;
    }

    public Date getDegistirme_tarihi() {
        return degistirme_tarihi;
    }

    public void setDegistirme_tarihi(Date degistirme_tarihi) {
        this.degistirme_tarihi = degistirme_tarihi;
    }

    public String getEkul() {
        return ekul;
    }

    public void setEkul(String ekul) {
        this.ekul = ekul;
    }

    public String getDkul() {
        return dkul;
    }

    public void setDkul(String dkul) {
        this.dkul = dkul;
    }
}
