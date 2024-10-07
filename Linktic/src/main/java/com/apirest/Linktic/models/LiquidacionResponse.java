package com.apirest.Linktic.models;

import java.util.List;


public class LiquidacionResponse {
    private int tipoIdentificacion;
    private int numeroIdentificacion;
    private int valorAsegurado;
    private List<LiquidacionItem> liquidacion;
    private double valorTotal;

    public LiquidacionResponse(int tipoIdentificacion, int numeroIdentificacion, int valorAsegurado, List<LiquidacionItem> liquidacion, double valorTotal) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.valorAsegurado = valorAsegurado;
        this.liquidacion = liquidacion;
        this.valorTotal = valorTotal;
    }

	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public int getValorAsegurado() {
		return valorAsegurado;
	}

	public void setValorAsegurado(int valorAsegurado) {
		this.valorAsegurado = valorAsegurado;
	}

	public List<LiquidacionItem> getLiquidacion() {
		return liquidacion;
	}

	public void setLiquidacion(List<LiquidacionItem> liquidacion) {
		this.liquidacion = liquidacion;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

    
}

