package br.com.caelum.livraria.bean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MenuBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer index=0;
	
	public Integer getIndex() {
		return index;
	}
	
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	public String paginaLivros() {
		this.index = 0;
		return "livros?faces-redirect=true";
	}
	
	public String paginaAutores() {
		this.index = 1;
		return "autores?faces-redirect=true";
	}

	public String paginaLogin() {
		this.index = 0;
		return "login?faces-redirect=true";
	}
}
