package com.jbac.web.cuenta_ahorros;

public class CuentaAhorro extends CuentaBancaria {

	public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
		super(numeroCuenta, titular, saldo);
	}

	public CuentaAhorro(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	@Override
	public String toString() {
		return "CuentaAhorro [NumeroCuenta=" + getNumeroCuenta() + ", Titular=" + getTitular() + ", Saldo=" + getSaldo()
				+ "]";
	}

	@Override
	void retiro(double monto) {
		if (monto <= 0) {
			System.out.println("Ingrese un numero mayor a cero");
		} else {
			super.saldo -=monto;
		}
	}

}
