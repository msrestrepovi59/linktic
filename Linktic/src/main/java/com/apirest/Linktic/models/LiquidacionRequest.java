package com.apirest.Linktic.models;


public class LiquidacionRequest {
    private int tipo_identificacion;
    private int num_identificacion;
    private int valorAsegurado;
    
	public int gettipo_identificacion() {
		return tipo_identificacion;
	}
	public void settipo_identificacion(int tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}
	public int getnum_identificacion() {
		return num_identificacion;
	}
	public void setnum_identificacion(int num_identificacion) {
		this.num_identificacion = num_identificacion;
	}
	public int getValorAsegurado() {
		return valorAsegurado;
	}
	public void setValorAsegurado(int valorAsegurado) {
		this.valorAsegurado = valorAsegurado;
	}

    
}

