package modelo;

import java.util.ArrayList;


public class Validador {

	public static boolean nombreCompleto(String nombre) {
		if (nombre.isEmpty()) {
			return false;
		}else {
			return true;
		}	
	
	}
	
	public static boolean expYFuerza(int experiencia, int fuerza) {
		
		if((experiencia >= 0) && (experiencia <= 100)) {
			if(((fuerza >= 0) && (fuerza <= 100))) {
				
				return true;
			}
			
		}else {
			return false;
		}
		
		return false;
		
	}
	
	public static boolean nombreExiste(String nombre) {
		
		ModeloCaballero mc = new ModeloCaballero();
		mc.testNombre(nombre);
		return true;
		
		
	}
	
	public static boolean armaEscudoRellenado(Arma arma, Escudo escudo) {
		if ((arma == null) && (escudo == null)) {
			return false;
		}else {
			return true;
		}
		
	}
	
}
