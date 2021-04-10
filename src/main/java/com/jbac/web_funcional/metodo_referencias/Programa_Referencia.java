package com.jbac.web_funcional.metodo_referencias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Programa_Referencia {
	
	 List<Persona> lista = new ArrayList<Persona>();
	 public Programa_Referencia() {
			lista.add(new Persona("Jhovin",LocalDate.now(),1500));
			lista.add(new Persona("Maho",LocalDate.of(1997,8, 24),1900));
			lista.add(new Persona("Boni",LocalDate.of(1998,5, 16),2000));
			lista.add(new Persona("Jbac",LocalDate.of(1998,12, 26),1850));
		}
	public static void main(String[] args) {
		
		Programa_Referencia pro= new Programa_Referencia();
		pro.imprimirLista("Lista original");
		pro.refereciaConstructor();
		
	}

	private void refereciaConstructor() {
		//Forma 1
		//IPersona per = (persona,fechaNacimiento)->new Persona("jhovin",LocalDate.of(1997,8,24));
		//Forma 2
		IPersona per = Persona::new;
		lista.add(per.crearPersona("Luz",LocalDate.of(1998,05,19)));
		imprimirLista("Se agrego persona");
		
//		IPersona2 per2 = Persona::new;
//		lista.add(per2.crearPersona("Camila",LocalDate.of(2001,8,24),2000));
//		imprimirLista("Se agrego persona");
		
	}

	private void imprimirLista(String mensaje) {
		System.out.println(mensaje);
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		
	}
	
	
	
}

interface IPersona{
	Persona crearPersona(String persona,LocalDate fechaNacimiento);
}
interface IPersona2{
	Persona crearPersona(String nombre, LocalDate fechaNacimiento,Integer salario);
}
