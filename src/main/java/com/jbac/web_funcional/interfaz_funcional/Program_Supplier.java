package com.jbac.web_funcional.interfaz_funcional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Program_Supplier {
	public static void main(String[] args) {
		//Sin formato
		Supplier<LocalDateTime> fechaAndTime = ()->LocalDateTime.now();
		System.out.println("Fecha y Hora Actual: "+fechaAndTime.get());
		//Con formato
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		Supplier<String> fechaConFormato = ()->{
			return formato.format(LocalDateTime.now()); 
		};
		System.out.println("Fecha y Hora Actual: "+fechaConFormato.get());
		
		
		
	}
}
