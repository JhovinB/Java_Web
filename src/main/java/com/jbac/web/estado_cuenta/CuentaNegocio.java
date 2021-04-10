package com.jbac.web.estado_cuenta;

public class CuentaNegocio extends CuentaBancaria implements IOperacionesBancarias{

	
	
	private double limitePrestamo;
	
	
	public CuentaNegocio(String numeroCuenta, String titular, double saldo) {
		super(numeroCuenta, titular, saldo);
	}

	public CuentaNegocio(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}
	

	public CuentaNegocio(String numeroCuenta, String titular, double saldo,double limitePrestamo) {
		super(numeroCuenta, titular,saldo);
		this.limitePrestamo = limitePrestamo;
	}
	
	

	public double getLimitePrestamo() {
		return limitePrestamo;
	}

	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}

	@Override
	public void deposito(double monto) {
		if(monto<0) {
			System.out.println("Ingrese un numero mayor a cero");
		}else {
			//this.saldo = saldo+monto;
			this.saldo+=monto;
		}
	}

	@Override
	public void retiro(double monto) {
		
		 if(monto<=0) {
			 System.out.println("Ingrese un monto por favor!!");
		 }else if(monto==saldo || monto>=saldo) {
			 	System.out.println("El monto no se puede retirar");
		 }else {
				this.saldo -=monto;
				this.saldo -=COMISION_RETIRO;
					System.out.println("Retiro existoso de " +saldo+" soles ");
					
			}
	}

	@Override
	public String toString() {
		return "CuentaNegocio [limitePrestamo=" + limitePrestamo + ", numeroCuenta=" + numeroCuenta + ", titular="
				+ titular + ", saldo=" + saldo + ", estado=" + estado + "]";
	}
	
	
	
	
}
