package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.From;
import java.util.List;

@Stateless
public class MensagemDAO {

    @PersistenceContext(unitName="default")
    private EntityManager em;

    public void inserir(Mensagem msg){
        em.persist(msg);
    }

    public List<Mensagem> listar(){
        return em.createQuery("FROM Mensagem").getResultList();
    }

    public Mensagem pesquisarPorId(long id){
        Mensagem msg = em.find(Mensagem.class,id);
        return msg;
    }
}
