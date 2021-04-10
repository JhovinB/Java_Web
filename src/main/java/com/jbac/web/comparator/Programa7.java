package com.jbac.web.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa7 {
	public static void main(String[] args) {
		
		String [] lenguajes = {"JAVA","C#","PYTHON","GO","JAVASCRIPT"};
		
		List<String> lista= Arrays.asList(lenguajes);
		System.out.println("Lista de Lenguajes: "+lista);
		
		Collections.sort(lista);
		System.out.println("Lista ordenada: "+lista);
		Collections.reverse(lista);
		System.out.println("Lista inversa: "+lista);
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Java Web", "Miranda"));
		cursos.add(new Curso("Web avanzado", "Torrico"));
		cursos.add(new Curso("Móviles", "Benites"));
		cursos.add(new Curso("Arduino", "Arce"));
		
//		for (Curso curso : cursos) {
//			System.out.println(curso);
//		}
		
//		Collections.sort(cursos,new Comparator<Curso>() {
//
//			@Override
//			public int compare(Curso curso1, Curso curso2) {
//				return curso1.nombre.compareTo((curso2.nombre));
//			}
//		});
		
		//Refactorizando Código
		Collections.sort(cursos,new CompararCursos());

		for (Curso curso : cursos) {
			System.out.println(curso);
		}
		
		
	}
	
}	
	class Curso{
		
		String nombre;
		String profesor;
		
		public Curso(String nombre, String profesor) {
			this.nombre = nombre;
			this.profesor = profesor;
		}
		@Override
		public String toString() {
			return "Cursos [nombre=" + nombre + ", profesor=" + profesor + "]";
		}
		
		
	}
	class CompararCursos implements Comparator<Curso>{

		@Override
		public int compare(Curso curso1, Curso curso2) {
			return curso1.nombre.compareTo((curso2.nombre));
		}
		
	}
