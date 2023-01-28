package com.java;

public class Ejercicio3Tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 3 Terminar el ejercicio de las fotomultas agregando Zona escolar
		
		int velocidadActualcoche = 80; //Km*h
		int velocidadLimite = 70; //km*h
		
		boolean carretera = true;
		boolean ZonaEscolar = false;
			
		if(carretera==true) {
			velocidadLimite = 100;
		
			
			if(velocidadActualcoche>velocidadLimite) {
				// Block code
				System.out.println("Carretera - Multa");
			}else {
				System.out.println("Carretera - Eres un buen conductor");
			}
			
		}
		if (ZonaEscolar==true) {
			velocidadLimite = 40;
			
			if(velocidadActualcoche>velocidadLimite) {
				System.out.println("Zona Escolar - Multa");
			}else {
				System.out.println("Zona Escolar - Eres buen conductor");
			}
			
		}
		else if(velocidadActualcoche>velocidadLimite) {
			// Block code
			System.out.println("Calle - Multa");
		}else {
			System.out.println("Calle - Eres un buen conductor");
		}
		
	}

}
