package com.jbac.web.cuenta_negocio;

public class CuentaBancariaEmpresa extends CuentaBancaria {
	
	private double limitePrestamo;
	
	public CuentaBancariaEmpresa(String numeroCuenta, String titular,double limitePrestamo) {
		super(numeroCuenta, titular);
		this.limitePrestamo = limitePrestamo;
	}

	public CuentaBancariaEmpresa(String numeroCuenta, String titular, double saldo,double limitePrestamo) {
		super(numeroCuenta, titular, saldo);
		this.limitePrestamo = limitePrestamo;
	}
	
	public double getLimitePrestamo() {
		return limitePrestamo;
	}

	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}
	
	void prestamo(double prestamo) {
		if(prestamo<=limitePrestamo) {
			super.deposito(prestamo-10);//comision por prestamo=10
		}else {
			System.out.println("Supera el límite de prestamo");
		}
	}

	@Override
	public String toString() {
		return "CuentaBancariaEmpresa [limitePrestamo=" + limitePrestamo + ", NumeroCuenta=" + getNumeroCuenta()
				+ ", Titular=" + getTitular() + ", Saldo=" + getSaldo() + "]";
	}
	
	
}
