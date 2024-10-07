package com.apirest.Linktic.models;


public class LiquidacionItem {
    private int codigoAmparo;
    private String nombreAmparo;
    private double valorPrima;

    public LiquidacionItem(int codigoAmparo, String nombreAmparo, double valorPrima) {
        this.codigoAmparo = codigoAmparo;
        this.nombreAmparo = nombreAmparo;
        this.valorPrima = valorPrima;
    }

	public int getCodigoAmparo() {
		return codigoAmparo;
	}

	public void setCodigoAmparo(int codigoAmparo) {
		this.codigoAmparo = codigoAmparo;
	}

	public String getNombreAmparo() {
		return nombreAmparo;
	}

	public void setNombreAmparo(String nombreAmparo) {
		this.nombreAmparo = nombreAmparo;
	}

	public double getValorPrima() {
		return valorPrima;
	}

	public void setValorPrima(double valorPrima) {
		this.valorPrima = valorPrima;
	}

    
    
}

