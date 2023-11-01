package co.edu.udistrital.model;

import java.util.ArrayList;

public class Directorio {
	
	private ArrayList<Persona> directorio;
	
	public Directorio() {
		
		directorio=new ArrayList<Persona>();
		cargarDatosIniciales();
	}
	
	public void cargarDatosIniciales() {
		
		Persona x;
		
		x= new Persona("Ana","Femenino","Medellin","3168556655","Ana@gimail,com","m1");
		directorio.add(x);
		
		x= new Persona("Hugo","Masculino", "Bogota","3168556655","Hugo@gimail,com","h1");
		directorio.add(x);
		
		x= new Persona("Maria","Femenino", "Bogota","3168556655","Maria@gimail,com","m2");
		directorio.add(x);
		
		x= new Persona("Paco","Masculino", "Cali","3168556655","Paco@gimail,com","h2");
		directorio.add(x);
		
		x= new Persona("Luz","Femenino", "Cali","3168556655","Luz@gimail,com","m3");
		directorio.add(x);
		
		x= new Persona("Luis","Masculino", "Medellin","3168556655","Luis@gimail,com","h3");
		directorio.add(x);
		
	}
	
	public int obtenerTamanoDirectorio() {
		return directorio.size();
	}

	public ArrayList<Persona> getDirectorio() {
		return directorio;
	}

	public void setDirectorio(ArrayList<Persona> directorio) {
		this.directorio = directorio;
	}
}
