package com.example.TesteIni.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	// @ID indica que será chave primaria
	// @GeneratedValue(strategy = GenerationType.IDENTITY) indica que o banco de dados será responsável por gerar o ID da tabela
	
	@Column(nullable = false)
	private String nome;
	//// @Column (nullable = false) não precisa colocar esta notação caso não queira adicionar algum incremento na coluna, pois a notação ENTITY trata. Mas caso queira add algo a mais, será necessário
}
