package com.jbac.web;


public class HelloWorld {
	
	public static void main(String[]args) {
		
		Persona p2 = new Persona();
		p2.nombre="Maho";
		
		Persona p3 = p2;
		p3 = new Persona();
		p3.nombre="Jhovin";
		
		
		System.out.println("Nombre1: "+p2.nombre);
		System.out.println("Nombre2: "+p3.nombre);
		
		
	}
}

	class Persona{
		
		String nombre;
		
		public Persona() {
			
		}
		
		public Persona(String nombre) {
			this.nombre=nombre;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + "]";
		}
				
	}
