package dao;

import entity.Yazar;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;


public class KitapDao {
    private EntityManager entityManager;

    public KitapDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public void save(Yazar kitap) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            if (kitap.getId() == null) {
                entityManager.persist(kitap);
            } else {
                entityManager.merge(kitap);
            }
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }
    
    public Yazar findById(Long id) {
        return entityManager.find(Yazar.class, id);
    }

    public List<Yazar> findAll() {
        TypedQuery<Yazar> query = entityManager.createQuery("SELECT * FROM kitap", Yazar.class);
        return query.getResultList();
    }

    public void delete(Yazar kitap) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(kitap);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }
    
}
