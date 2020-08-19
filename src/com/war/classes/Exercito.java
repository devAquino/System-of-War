package com.war.classes;

import java.util.ArrayList;
import java.util.List;

import com.war.interfaces.IExercito;
import com.war.interfaces.ISoldado;

public class Exercito implements IExercito{
	
	List<ISoldado> soldados = new ArrayList<ISoldado>();
	private Soldado soldado;

	@Override
	public void alistarSoldado(ISoldado soldado) {
		soldados.add(soldado);
		
	}

	@Override
	public void dispensarSoldado(ISoldado soldado) {
		soldados.remove(soldado);
		
	}

	@Override
	public void notificarSoldado() {
		for(ISoldado soldier: soldados ) {
			soldier.update(soldado);
		}
		
	}
	

}
