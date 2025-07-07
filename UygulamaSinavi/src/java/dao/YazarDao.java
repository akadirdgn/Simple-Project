package dao;


import entity.Kitap;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class YazarDao {
    
    private EntityManager entityManager;

    public YazarDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public void save(Kitap yazar) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            if (yazar.getId() == null) {
                entityManager.persist(yazar);
            } else {
                entityManager.merge(yazar);
            }
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }
    
    
    
    public Kitap findById(Long id) {
        return entityManager.find(Kitap.class, id);
    }

    public List<Kitap> findAll() {
        TypedQuery<Kitap> query = entityManager.createQuery("SELECT * FROM yazar", Kitap.class);
        return query.getResultList();
    }

    public void delete(Kitap yazar) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(yazar);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }
}
