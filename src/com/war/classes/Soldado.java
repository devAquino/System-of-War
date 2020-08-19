package com.war.classes;

import com.war.interfaces.IArma;
import com.war.interfaces.ISoldado;

public class Soldado implements ISoldado{

	private String nome;
	private int pelotao;
	
	private IArma arma;
	
	public Soldado(String nome, int pelotao, IArma arma) {
		super();
		this.nome = nome;
		this.pelotao = pelotao;
		arma.recarregarArma();

	}
	public String getNome() {
		return nome;
	}
	public int getPelotao() {
		return pelotao;
	}
	
	@Override
	public void update(Soldado soldado) {
		System.out.println("Soldado "+getNome()+", pelotão "+getPelotao() + ", atirando");
		
	}	

}
