package com.jbac.web.genericos;

public class ClaseGenerica <T>{

	private T variableInstacia;
	private T[] arregloGenerico;
	
	
	public T getVariableInstacia() {
		return variableInstacia;
	}
	public void setVariableInstacia(T variableInstacia) {
		this.variableInstacia = variableInstacia;
	}
	public T[] getArregloGenerico() {
		return arregloGenerico;
	}
	public void setArregloGenerico(T[] arregloGenerico) {
		this.arregloGenerico = arregloGenerico;
	}
	


}

