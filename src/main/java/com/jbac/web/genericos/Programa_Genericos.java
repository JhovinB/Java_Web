package com.jbac.web.genericos;

import java.util.ArrayList;
import java.util.List;

public class Programa_Genericos {
	public static void main(String[] args) {
		
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(new Estudiante("Jhovin",20));
		estudiantes.add(new Estudiante("Jbac",18));
		estudiantes.add(new Estudiante("Maho",16));
		//imprimir(estudiantes);
		imprimirWildCardConExtends(estudiantes);
		List<Docente> docentes = new ArrayList<Docente>();
		docentes.add(new Docente("Jaime", "FullStack"));
		docentes.add(new Docente("Diego", "JAVA Web"));
		//imprimir(docentes);

		imprimirWildCardConSuper(docentes);
	}
	
	//Imprimir de forma Separada
	
	/*private static void imprimir1(List<Docente> docentes) {
		for (Docente docente : docentes) {
			System.out.println(docente);
		}
	}
	private static void imprimir2(List<Estudiante> estudiantes) {
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
		}
	}*/
	
	//Imprimir de Forma Generica
	private static<T> void imprimir(List<T> lista) {
		for (T elementos : lista) {
			System.out.println(elementos);
		}
	}
	
	//Imprimir con WildCard
	private static void imprimirWildCardConExtends(List<? extends Persona> lista) {
		for (Persona elementos : lista) {
			System.out.println(elementos);
		}
	}
	private static void imprimirWildCardConSuper(List<? super Docente> lista) {
		for (Object elementos : lista) {
			System.out.println(elementos);
		}
	}
}
class Persona{
	String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

}
class Estudiante extends Persona{
	
	int nota;
	
	public Estudiante(String nombre,int nota) {
		super(nombre);
		this.nota=nota;
	}
	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + "]";
	}
	
}
class Docente extends Persona{
	
	String curso;

	public Docente(String nombre, String curso) {
		super(nombre);
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Docente [curso=" + curso + ", nombre=" + nombre + "]";
	}
	
	
}
