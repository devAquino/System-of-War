package com.war.classes;

import java.util.ArrayList;
import java.util.List;

import com.war.interfaces.ISoldado;

public class General extends AGeneral{

	//private Soldado soldado;
	List<ISoldado> soldados = new ArrayList<ISoldado>();
	
	public void adicionaSoldado(ISoldado soldado) {
		soldados.add(soldado);
	}
	
	@Override
	public void preparar() {
		System.out.println("   -preparar armas");
	}

	@Override
	public void atirar() {
		System.out.println("   -atirar!");
		
	}
	
	
	
}
