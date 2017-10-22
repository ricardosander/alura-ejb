package br.com.caelum.livraria.bean;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

import javax.ejb.*;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class AutorService {

    @Inject
    private AutorDao autorDao;

    public void adiciona(Autor autor) {
        this.autorDao.salva(autor);
    }

    public List<Autor> todosAutores() {
        return autorDao.todosAutores();
    }

}
