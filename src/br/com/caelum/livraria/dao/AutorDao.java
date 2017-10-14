package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Autor;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AutorDao {

    @Inject
    private Banco banco;

    @PostConstruct
    void aposCriacao() {
        System.out.println("[INFO] " + this.getClass().getName() + " criado!");
    }

    public void salva(Autor autor) {

        System.out.println("[INFO] salvando autor " + autor.getNome() + ".");

        banco.save(autor);

        System.out.println("[INFO] autor " + autor.getNome() + " salvo.");
    }

    public List<Autor> todosAutores() {
        return banco.listaAutores();
    }

    public Autor buscaPelaId(Integer autorId) {
        Autor autor = this.banco.buscaPelaId(autorId);
        return autor;
    }

}
