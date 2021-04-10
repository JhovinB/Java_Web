package com.jbac.web.estado_cuenta;

public class Programa6 {

	 public static void main(String[] args) {
		
		 CuentaAhorro cuenta= new CuentaAhorro("123-456","Jhovin",100);
		 cuenta.retiro(20);
		System.out.println("Cuenta: "+cuenta.toString());
		System.out.println("Estado abreviado "+cuenta.estado.getAbreviatura());
		if (cuenta.estado ==EstadoCuenta.ACTIVA) {
			System.out.println("Cuenta Activa");
		}else if(cuenta.estado==EstadoCuenta.BLOQUEADA) {
			System.out.println("Cuenta Bloqueada");
		}
		System.out.println("--------------------");
		 CuentaNegocio cuenta1 = new CuentaNegocio("123456", "jhovin",1000,300);
		 cuenta1.retiro(300);
		 System.out.println("Cuenta 1: "+cuenta1.toString());
		 System.out.println("-------------------------");
		 CuentaAhorro cuenta2 =  new CuentaAhorro("98765", "jbac",300);
		 cuenta2.retiro(100);
		 System.out.println("Cuenta 2: "+cuenta2.toString());
	 }
}
