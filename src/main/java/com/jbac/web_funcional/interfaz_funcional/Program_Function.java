package com.jbac.web_funcional.interfaz_funcional;

import java.util.function.Function;

public class Program_Function {
	
	public static void main(String[] args) {
		
		Function<String,Integer> funcionObtener =(cadena)->cadena.length();
		System.out.println(funcionObtener.apply("Java Web"));
	
		Function<Integer,Boolean> esPar=(numero)->numero%2==0;
		System.out.println("Numero 868:"+esPar.apply(868));
	
		
		
	}
}
