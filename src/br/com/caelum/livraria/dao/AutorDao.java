package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Autor;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AutorDao {

    @PersistenceContext
    private EntityManager entityManager;

    @PostConstruct
    void aposCriacao() {
        System.out.println("[INFO] " + this.getClass().getName() + " criado!");
    }

    public void salva(Autor autor) {

        System.out.println("[INFO] salvando autor " + autor.getNome() + ".");

        entityManager.persist(autor);

        System.out.println("[INFO] autor " + autor.getNome() + " salvo.");
    }

    public List<Autor> todosAutores() {
        return entityManager.createQuery("select a from Autor a", Autor.class).getResultList();
    }

    public Autor buscaPelaId(Integer autorId) {
        return entityManager.find(Autor.class, autorId);
    }

}
