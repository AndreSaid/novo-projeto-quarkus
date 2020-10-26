package com.novoprojeto.nick;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Categoria extends PanacheEntity{
	
	private String nome;
	
	public Categoria() {
	}
	
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
