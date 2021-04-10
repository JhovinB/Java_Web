package com.jbac.web.cuenta_bancaria;

import java.util.Scanner;

public class Programa1 {
	
	public static void main(String[] args) {
		
		CuentaBancaria cuenta = null;
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Elige una opción del menú");
		System.out.println("1.Crear Cuenta");
		System.out.println("2.Hacer un depósito");
		System.out.println("3.Hacer un retiro");
		System.out.println("4.Consultar saldo");
		System.out.println("5.Salir");
		
		int opcion = sc.nextInt();
		double monto;
		switch (opcion) {
		case 1:
			//Crear Cuenta
			System.out.println("Ingrese número de cuenta: ");
			String numeroCuenta = sc.next();
			System.out.println("Ingrese el titular de la cuenta: ");
			String titularCuenta = sc.next();
			System.out.println("¿Desea realizar un depósito inicial(S/N)? ");
			boolean isDesposito = sc.nextBoolean();
		
			if (isDesposito) {
				System.out.println("Ingrese el monto inicial");
				 monto = sc.nextDouble();
				cuenta = new CuentaBancaria(numeroCuenta, titularCuenta,monto);	
			}else {
				cuenta = new CuentaBancaria(numeroCuenta, titularCuenta);
			}
			System.out.println("Cuenta: "+cuenta.toString());
			break;
		case 2:
			//Depositar
			System.out.println("Ingrese el monto a depositar");
			monto = sc.nextDouble();
			cuenta.deposito(monto);
			System.out.println("Cuenta: "+cuenta.toString());
			break;
		case 3:
			//Retiro
			System.out.println("Ingrese el monto a retirar");
			monto = sc.nextDouble();
			cuenta.retiro(monto);
			System.out.println("Cuenta: "+cuenta.toString());
			break;
		case 4:
			System.out.println("Tu saldo es: "+cuenta.getSaldo());
			break;
		default:
			System.out.println("Gracias por tu visita");
			salir=true;
			break;
		}
		//System.out.println("Cuenta: "+cuenta.toString());
		}while(!false);
	}
}
