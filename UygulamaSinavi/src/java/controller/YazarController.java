package controller;

import dao.YazarDao;
import entity.Kitap;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.Serializable;
import java.util.List;


@ManagedBean
@SessionScoped
public class YazarController implements Serializable{
    Kitap yazar;
    List<Kitap> yazarList;
    YazarDao yazarDao;
    
    private static EntityManagerFactory emf =Persistence.createEntityManagerFactory("examplePU");
    private static EntityManager em = emf.createEntityManager();
    
    
    public YazarController(){
        yazar = new Kitap();
        yazarDao = new YazarDao(em);
        yazarList = yazarDao.findAll();
    }
    
    
    public String saveYazar() {
        yazarDao.save(yazar);
        yazar = new Kitap();  
        yazarList = yazarDao.findAll(); 
        return "yazarList"; 
    }

    public String deleteYazar(Kitap category) {
        yazarDao.delete(category);
        yazarList = yazarDao.findAll(); 
        return null;  
    }
   
    public List<Kitap> getYazarList() {
        return yazarList;
    }

    public Kitap getYazar() {
        return yazar;
    }

    public void setYazar(Kitap yazar) {
        this.yazar = yazar;
    }
}
