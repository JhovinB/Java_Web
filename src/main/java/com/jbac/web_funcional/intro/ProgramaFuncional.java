package com.jbac.web_funcional.intro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgramaFuncional {
	
	public static void main(String[] args) {
			
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("jhovin", "boni", 23, 1200, LocalDate.of(1997, 8, 24)));
		lista.add(new Persona("jaya", "yaja", 20, 1000, LocalDate.now()));
		//lista.forEach(System.out::println);
		
		lista.stream().forEach(persona->System.out.println("Personas: "+lista));

	}
	
}
