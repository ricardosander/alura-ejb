package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Livro;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LivroDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salva(Livro livro) {
        entityManager.persist(livro);
    }

    public List<Livro> todosLivros() {
        return entityManager.createQuery("select l from Livro l", Livro.class).getResultList();
    }

}
