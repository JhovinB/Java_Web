package com.jbac.web.estado_cuenta;

public class CuentaAhorro extends CuentaBancaria implements IOperacionesBancarias{

	private double tasaInteres;
	
	
	public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
		super(numeroCuenta, titular, saldo);
	}

	public CuentaAhorro(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}
	

	public CuentaAhorro(String numeroCuenta, String titular, double saldo,double tasaInteres) {
		super(numeroCuenta, titular,saldo);
		this.tasaInteres = tasaInteres;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public void retiro(double monto) {

		 if(monto<=0) {
			 System.out.println("Ingrese un monto por favor!!");
		 }else if(monto==saldo || monto>=saldo) {
			 	System.out.println("El monto no se puede retirar");
		 }else {
				this.saldo -=monto;
					System.out.println("Retiro existoso de " +saldo+" soles ");
					
			}
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
	public String toString() {
		return "CuentaAhorro [tasaInteres=" + tasaInteres + ", numeroCuenta=" + numeroCuenta + ", titular=" + titular
				+ ", saldo=" + saldo + ", estado=" + estado + "]";
	}
	
	
	

}
