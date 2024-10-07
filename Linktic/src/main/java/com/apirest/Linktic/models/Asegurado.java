package com.apirest.Linktic.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "asegurados")
public class Asegurado {
	
    private int tipo_identificacion;
    @Id
    @Column(name = "num_identificacion", nullable = false)
    private int num_identifacion;
    
    private String apellidos;
    private String nombres;
    private int sexo;
    private LocalDate fechaNacimiento;
    
	public int gettipo_identificacion() {
		return tipo_identificacion;
	}
	public void settipo_identificacion(int tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}
	public int getnum_identifacion() {
		return num_identifacion;
	}
	public void setnum_identifacion(int num_identifacion) {
		this.num_identifacion = num_identifacion;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

    
}

