package com.war.armas;

import com.war.interfaces.IArma;

public class Tanque implements IArma{

private String arma;
	
	public String getArma() {
		return arma;
	}

	public Tanque(String arma) {
		this.arma = arma;
	}
	
	@Override
	public void recarregarArma() {
		System.out.println(getArma()+" recarregada");
		
	}

}
