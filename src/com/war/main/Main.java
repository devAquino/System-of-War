package com.war.main;

import com.war.armas.Bazuca;
import com.war.armas.Metralhadora;
import com.war.classes.Exercito;
import com.war.classes.General;
import com.war.classes.Soldado;
import com.war.interfaces.IArma;

public class Main {
	
	public static void main(String[] args) {
		
		// Para adicionar mais armas basta criar uma nova instância da classe da arma
		
		IArma metralhadora = new Metralhadora("Metralhadora");
		IArma bazuca = new Bazuca("Bazuca");
		
		//m.recarregarArma();
		
		Exercito exercito = new Exercito();
		Soldado soldado1 = new Soldado("Reginaldo", 1, metralhadora);
		Soldado soldado2 = new Soldado("Paulo", 2, bazuca);
		
		
		// O general adiciona os soldados ao seu pelotão
		General general = new General();
		general.adicionaSoldado(soldado1);
		general.adicionaSoldado(soldado2);
		
		// Ordens do general
		System.out.println("Ordens do General: ");
		general.preparar();
		general.atirar();

		
		exercito.alistarSoldado(soldado1);
		exercito.alistarSoldado(soldado2);
		exercito.notificarSoldado();
		
	}

}
