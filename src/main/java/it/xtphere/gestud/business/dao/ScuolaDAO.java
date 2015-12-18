package it.xtphere.gestud.business.dao;

import it.xtphere.gestud.business.entity.Materia;
import it.xtphere.gestud.business.entity.PianoDiStudi;
import it.xtphere.gestud.business.entity.Utente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
public class ScuolaDAO {

    @PersistenceContext
    EntityManager em;

// -------------------------  Utente DAO
    public Utente readUtente(Long id) {
        return em.find(Utente.class, id);
    }

    public Utente saveUtente(Utente utente) {
        return em.merge(utente);
    }

    public void deleteUtente(Utente utente) {
        em.remove(em.merge(utente));
    }

    public List<Utente> listUtente() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Utente> query = cb.createQuery(Utente.class);
        Root<Utente> utenteRoot = query.from(Utente.class);
        query.select(utenteRoot);
        return em.createQuery(query).getResultList();
    }
    

    // -------------------------  PianoDiStudi DAO
    public PianoDiStudi readPianoDiStudi(Long id) {
        return em.find(PianoDiStudi.class, id);
    }

    public PianoDiStudi savePianoDiStudi(PianoDiStudi pianoDiStudi) {
        return em.merge(pianoDiStudi);
    }

    public void deletePianoDiStudi(PianoDiStudi pianoDiStudi) {
        em.remove(em.merge(pianoDiStudi));
    }

    public List<PianoDiStudi> listPianoDiStudi() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PianoDiStudi> query = cb.createQuery(PianoDiStudi.class);
        Root<PianoDiStudi> pianoDiStudiRoot = query.from(PianoDiStudi.class);
        query.select(pianoDiStudiRoot);
        return em.createQuery(query).getResultList();
    }
    

    // ------------------------- Materia DAO
    public Materia readMateria(Long id) {
        return em.find(Materia.class, id);
    }

    public Materia saveMateria(Materia materia) {
        return em.merge(materia);
    }

    public void deleteMateria(Materia materia) {
        em.remove(em.merge(materia));
    }

    public List<Materia> listMateria() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Materia> query = cb.createQuery(Materia.class);
        Root<Materia> materiaRoot = query.from(Materia.class);
        query.select(materiaRoot);
        return em.createQuery(query).getResultList();
    }
}
