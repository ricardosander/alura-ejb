package br.com.caelum.livraria.dao;

import br.com.caelum.livraria.modelo.Usuario;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)//padrão, opcional.
public class UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)//padrão, opcional.
    public Usuario buscaPeloLogin(String login) {

        return (Usuario) entityManager
                .createQuery("select u from Usuario u where u.login = :pLogin")
                .setParameter("pLogin", login)
                .getSingleResult();
    }

}
