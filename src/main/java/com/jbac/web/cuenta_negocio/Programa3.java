package com.jbac.web.cuenta_negocio;

public class Programa3 {

	public static void main(String[] args) {
		
		CuentaBancariaEmpresa cuentaEmpresa = new CuentaBancariaEmpresa("123-456","jhovin",100);
		System.out.println("Cuenta Empresa:"+cuentaEmpresa.toString());
		
		cuentaEmpresa.prestamo(60);
		System.out.println("Cuenta Empresa:"+cuentaEmpresa.toString());
		
		cuentaEmpresa.prestamo(150);
		System.out.println("Cuenta Empresa:"+cuentaEmpresa.toString());
		
		//CuentaEmpresa2 es tipo Cuenta Bancaria
		CuentaBancaria cuentaEmpresa2 = new CuentaBancariaEmpresa("1234","maho",200);
		System.out.println("Cuenta Empresa 2: "+cuentaEmpresa2.toString());
		//Castear
		CuentaBancariaEmpresa cuentaEmpresa3= (CuentaBancariaEmpresa)cuentaEmpresa2;
		cuentaEmpresa3.prestamo(100);
		System.out.println("Cuenta Empresa 3: "+cuentaEmpresa3.toString());
	}
}
