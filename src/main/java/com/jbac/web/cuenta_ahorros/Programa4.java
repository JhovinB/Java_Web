package com.jbac.web.cuenta_ahorros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa4 {

	public static void main(String[] args) {
		/*
		CuentaBancaria cuentaEmpresa = new CuentaBancariaEmpresa("1234","maho",1000,200);
		CuentaBancaria cuentaAhorro = new CuentaAhorro("4531","Jhovin",200);
		cuentaEmpresa.retiro(100);
		cuentaAhorro.retiro(100);
		System.out.println("Cuenta Empresa: "+cuentaEmpresa.toString());
		System.out.println("Cuenta Ahorro: "+cuentaAhorro.toString());*/
		
		
		List<CuentaBancaria> lista = new ArrayList<>();
		lista.add(new CuentaBancariaEmpresa("1234","maho",1000,200));
		lista.add(new CuentaAhorro("4531","Jhovin",200));
		
//		for (CuentaBancaria cuentas : cuenta) {
//			cuentas.retiro(100);
//			System.out.println("Cuenta: "+cuentas);
// 		}
		
		//Con Stream
		lista.stream().forEach((c)->System.out.println("Cuentas de Clientes: "+lista));
		//Con forEach
		lista.forEach(System.out::print);
		
	
	}
}
