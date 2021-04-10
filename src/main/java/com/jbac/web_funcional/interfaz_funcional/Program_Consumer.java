package com.jbac.web_funcional.interfaz_funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Program_Consumer {
	
	public static void main(String[] args) {
		
		consumer();
		BiConsumer();
	}
	private static void BiConsumer() {
		operar(9, 5,(a,b)->System.out.println(a+b));
		operar(9, 5,(a,b)->System.out.println(a-b));
		operar(9, 5,(a,b)->System.out.println(a*b));
		operar(9, 5,(a,b)->System.out.println(a/b));
	}

	private static void operar(int x,int y,BiConsumer<Integer,Integer> consumerOperacion) {
		consumerOperacion.accept(x,y);
	}
	
	private static void consumer() {
		String [] cursos = {"Jhovin","Bonifacio","Lozano"};
		Consumer<List<String>> consumidor =(lista)->{
			for (String dato :lista) {
				System.out.println("Hola: "+dato);
			}
		};
		consumidor.accept(Arrays.asList(cursos));;
		System.out.println("==================");
		Consumer<List<String>> consumidorModificacion =(lista)->{
			for (int i = 0; i < lista.size(); i++) {
				lista.set(i,(i+1)+" - "+lista.get(i));
			}
		};
		consumidorModificacion.andThen(consumidor).accept(Arrays.asList(cursos));
	}

}
