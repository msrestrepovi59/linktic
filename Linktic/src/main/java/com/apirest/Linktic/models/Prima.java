package com.apirest.Linktic.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "primas")
public class Prima {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
    private int codigo;
    
    private int edadMinima;
    private int edadMaxima;
    private double porcentajePrima;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public int getEdadMaxima() {
		return edadMaxima;
	}
	public void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}
	public double getPorcentajePrima() {
		return porcentajePrima;
	}
	public void setPorcentajePrima(double porcentajePrima) {
		this.porcentajePrima = porcentajePrima;
	}
}
