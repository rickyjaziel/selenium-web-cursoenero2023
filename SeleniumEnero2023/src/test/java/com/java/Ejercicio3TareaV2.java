package com.java;

public class Ejercicio3TareaV2 {

	public static void main(String[] args) {
		// Ejercicio 3 Terminar el ejercicio de las fotomultas agregando Zona escolar
		
		int VelocidadActual = 80;
		int VelocidadLimite = 80;
		
		boolean isCarretera = true;
		boolean isZonaEscolar = false;
		
		if (isCarretera && isZonaEscolar){
			System.out.println("ERROR"); 
		} else if (isCarretera && !isZonaEscolar) {
			VelocidadLimite = 100;
			
			if (VelocidadActual>VelocidadLimite) {
				System.out.println("CARRETERA - MULTA");
			}else {
				System.out.println("CARRETERA - ERES UN BUEN CONDUCTOR");
			}
		} else if (!isCarretera && isZonaEscolar) {
			VelocidadLimite = 40;
			
			if (VelocidadActual>VelocidadLimite) {
				System.out.println("ZONA ESCOLAR - MULTA");
			} else {
				System.out.println("ZONA ESCOLAR - ERES BUEN CONDUCTOR");
			}
		} else {
			
			if (VelocidadActual>VelocidadLimite) {
				System.out.println("CALLE - MULTA");
			} else {
				System.out.println("CALLE - ERES UN BUEN CONDUCTOR");
			}
		}
		
	}

}
