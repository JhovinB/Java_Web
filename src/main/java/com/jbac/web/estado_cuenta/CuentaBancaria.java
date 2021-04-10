package com.jbac.web.estado_cuenta;

public class CuentaBancaria {
	
	//Variables  de instancia
	protected String numeroCuenta;
	protected String titular;
	protected double saldo;
	

	protected EstadoCuenta estado;
	
	//Variable de clase
	public static final double COMISION_RETIRO = 5;
	
	//Constructores
	public CuentaBancaria(String numeroCuenta, String titular) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = 0;
		estado = EstadoCuenta.ACTIVA;
	}


	public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		estado = EstadoCuenta.ACTIVA;
	}
	
	//Modificadores
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	 public static double getComisionRetiro() {
		return COMISION_RETIRO;
	}

	
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo
				+ ", estado=" + estado + "]";
	}


//	void deposito(double monto) {
//		if(monto<0) {
//			System.out.println("Ingrese un numero mayor a cero");
//		}else {
//			//this.saldo = saldo+monto;
//			this.saldo+=monto;
//		}
//	}
	 
//	 void retiro(double monto) {
//	 if(monto<=0) {
//		 System.out.println("Ingrese un monto por favor!!");
//	 }else if(monto==saldo || monto>=saldo) {
//		 	System.out.println("El monto no se puede retirar");
//	 }else {
//			this.saldo -=monto;
//			this.saldo -=COMISION_RETIRO;
//				System.out.println("Retiro existoso de " +saldo+" soles ");
//				
//		}
//	 }
	 
	
}
