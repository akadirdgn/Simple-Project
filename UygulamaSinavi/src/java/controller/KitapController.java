package controller;

import dao.KitapDao;
import entity.Yazar;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class KitapController implements Serializable{
    Yazar kitap;
    List<Yazar> kitapList;
    KitapDao kitapDao;
    
    private static EntityManagerFactory emf =Persistence.createEntityManagerFactory("examplePU");
    private static EntityManager em = emf.createEntityManager();
    
    
    public KitapController(){
        kitap = new Yazar();
        kitapDao = new KitapDao(em);
        kitapList = kitapDao.findAll();
    }
    
    
    public String saveKitap() {
        kitapDao.save(kitap);
        kitap = new Yazar();  
        kitapList = kitapDao.findAll(); 
        return "kitapList"; 
    }

    public String deleteKitap(Yazar kitap) {
        kitapDao.delete(kitap);
        kitapList = kitapDao.findAll(); 
        return null;  
    }
    

    public List<Yazar> getKitapList() {
        return kitapList;
    }

    public Yazar getKitap() {
        return kitap;
    }

    public void setKitap(Yazar kitap) {
        this.kitap = kitap;
    }

    
}
