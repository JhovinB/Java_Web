package com.jbac.web_funcional.api_stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program_stream {
	
	public static void main(String[] args) {
		
		Program_stream pro = new Program_stream();
//		pro.introStream();
//		pro.intStream();
//		pro.mapStream();
		pro.flatMap();
		
	}
	private void flatMap() {
		Persona p1 = new Persona("Jhovin");
		p1.getHabilidades().add("JAVA");
		p1.getHabilidades().add("Python");
		p1.getHabilidades().add("PHP");
		p1.getHabilidades().add("Kotlin");
		
		Persona p2 = new Persona("Maho");
		p2.getHabilidades().add("GoLang");
		p2.getHabilidades().add("Scala");
		p2.getHabilidades().add("Java");
		p2.getHabilidades().add("C#");
		
		
		List<Persona> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		lista.add(new Persona());
		
		//List<Persona>-->List<String>
		lista.stream()//Stream<Persona>
			.map(persona->persona.getHabilidades())//Stream<List<String>>-->Stream<String>
			.flatMap(lenguaje->lenguaje.stream())//;Stream<String>
			.distinct()
			.forEach(System.out::println);
	
	}
	public void mapStream() {
		String [] nombres = {"Jhovin","Maho","Boni","mariela","angela"};
		Arrays.stream(nombres)
						.sorted()
						.map(nombre->nombre.toUpperCase())
						.filter(nombreMayuscula->nombreMayuscula.contains("LA"))
						.forEach(System.out::println);
		
	}
	public void intStream() {
		IntStream numero = IntStream.range(1,20).skip(2);
		numero.forEach(System.out::println);
		
		IntStream suma = IntStream.range(1, 10);
		System.out.println("La suma 1 al 10 es: "+suma.sum());
	}
	
	public void introStream() {
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona("Jhovin",LocalDate.now(),1500));
		lista.add(new Persona("Maho",LocalDate.of(1997,8, 24),1900));
		lista.add(new Persona("Boni",LocalDate.of(1998,5, 16),2000));
		lista.add(new Persona("Jbac",LocalDate.of(1998,12, 26),1850));
//		lista.forEach((persona)->System.out.println(persona));
		lista.stream().forEach((persona)->System.out.println("Impresion: "+persona));
		System.out.println("============");
		lista.stream()
			.filter(persona->persona.getEdad()>=18)
			.filter(persona->persona.getNombre().contains("B"))
			.forEach(System.out::println);
		
		List<Persona> lista2 = lista.stream()//Stream<Persona>
				.filter(persona->persona.getEdad()>=18)//Stream<Persona>
				.collect(Collectors.toList());//tolist->convierte a lista el stream
		System.out.println("============");
		lista2.stream().forEach(System.out::println);
	}

}
