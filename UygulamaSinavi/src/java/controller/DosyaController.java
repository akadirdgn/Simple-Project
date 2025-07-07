package controller;

import dao.DosyaDao;
import entity.Dosya;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class DosyaController implements Serializable{
    Dosya dosya;
    List<Dosya> dosyaList;
    DosyaDao dosyaDao;
    
    private static EntityManagerFactory emf =Persistence.createEntityManagerFactory("examplePU");
    private static EntityManager em = emf.createEntityManager();
    
    public DosyaController(){
        dosya = new Dosya();
        dosyaDao = new DosyaDao(em);
        dosyaList = dosyaDao.findAll();
    }
  
    public String saveDosya() {
        dosyaDao.save(dosya);
        dosya = new Dosya();  
        dosyaList = dosyaDao.findAll(); 
        return "dosyaList"; 
    }

    public String deleteDosya(Dosya dosya) {
        dosyaDao.delete(dosya);
        dosyaList = dosyaDao.findAll(); 
        return null;  
    }
    

    public List<Dosya> getDosyaList() {
        return dosyaList;
    }

    public Dosya getDosya() {
        return dosya;
    }

    public void setDosya(Dosya dosya) {
        this.dosya = dosya;
    }
    
}

