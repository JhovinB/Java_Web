package com.jbac.web.estado_cuenta;

public interface IOperacionesBancarias {

	public void retiro(double monto);
	public void deposito(double monto);
}
