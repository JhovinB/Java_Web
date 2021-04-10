package com.jbac.web.tipo_cambio;

public class ConvertidorMoneda {

	
	public static final double COMISION=0.06;
	
//	public double comprarDolar(double dolaresAComprar,double tipoCambio) {
//		
//		return  dolaresAComprar*tipoCambio*(1+COMISION);
//	}
	
	//Método de Clase Static
	public static double comprarDolar(double dolaresAComprar,double tipoCambio) {
		
		return  dolaresAComprar*tipoCambio*(1+COMISION);
	}
}
