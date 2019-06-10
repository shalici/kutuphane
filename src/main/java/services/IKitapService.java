package services;

import entity.Kitap;

import java.util.List;

public interface IKitapService {
    void kaydet(Kitap kitap);

    List<Kitap> kitapListesiGetir();
}
