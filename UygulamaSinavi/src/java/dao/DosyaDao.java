package dao;

import entity.Dosya;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class DosyaDao {
    private EntityManager entityManager;

    public DosyaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Dosya dosya) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            if (dosya.getId() == null) {
                entityManager.persist(dosya);
            } else {
                entityManager.merge(dosya);
            }
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    public Dosya findById(Long id) {
        return entityManager.find(Dosya.class, id);
    }

    public List<Dosya> findAll() {
        TypedQuery<Dosya> query = entityManager.createQuery("SELECT * FROM dosya", Dosya.class);
        return query.getResultList();
    }

    public void delete(Dosya dosya) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(dosya);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }
}
