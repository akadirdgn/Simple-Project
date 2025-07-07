package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;



@Entity
public class Kitap {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String baslik;
    private String ozet;
    private String ISBN;
    private String yayinci;
    private String kitapTuru;
    private int sayfaSayisi;
    private List<Kitap> yazarlar;

    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getOzet() {
        return ozet;
    }

    public void setOzet(String ozet) {
        this.ozet = ozet;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getYayinci() {
        return yayinci;
    }

    public void setYayinci(String yayinci) {
        this.yayinci = yayinci;
    }

    public String getKitapTuru() {
        return kitapTuru;
    }

    public void setKitapTuru(String kitapTuru) {
        this.kitapTuru = kitapTuru;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    
    public List<Kitap> getYazarlar() {
        return yazarlar;
    }

    public void setYazarlar(List<Kitap> yazarlar) {
        this.yazarlar = yazarlar;
    }
    
}
