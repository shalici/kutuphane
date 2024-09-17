package services;

import entity.KullaniciKayit;

import java.util.List;

public interface IKullaniciKayitService {
    public interface IPersonelservices {
        void kaydet(KullaniciKayit kullaniciKayit);

        List<KullaniciKayit> kullaniciListesiGetir();
    }
}