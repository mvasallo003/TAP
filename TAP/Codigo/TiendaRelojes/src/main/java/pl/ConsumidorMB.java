package pl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.EJBManager;
import dl.Caja;
import dl.Correa;
import dl.Esfera;
import dl.Numero;
import dl.Segundero;

@Named
@ViewScoped
public class ConsumidorMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private EJBManager prov;

	private List<Caja> cajas;
	private List<Correa> correas;
	private List<Esfera> esferas;
	private List<Numero> numeros;
	private List<Segundero> segunderos;

	private int caja;
	private int correa;
	private int esfera;
	private int numero;
	private int segundero;

	public List<Caja> getCajas() {
		if (cajas == null) {
			cajas = prov.getCajasDisponibles();
		}

		return cajas;
	}

	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}

	public void addCaja(int id1) {
		caja = id1;
	}

	public List<Correa> getCorreas() {
		if (correas == null) {
			correas = prov.getCorreasDisponibles();
		}

		return correas;
	}

	public void setCorreas(List<Correa> correas) {
		this.correas = correas;
	}

	public void addCorrea(int id2) {
		correa = id2;
	}

	public List<Esfera> getEsferas() {
		if (esferas == null) {
			esferas = prov.getEsferasDisponibles();
		}

		return esferas;
	}

	public void setEsferas(List<Esfera> esferas) {
		this.esferas = esferas;
	}

	public void addEsfera(int id3) {
		esfera = id3;
	}

	public List<Numero> getNumeros() {
		if (numeros == null) {
			numeros = prov.getNumerosDisponibles();
		}

		return numeros;
	}

	public void setNumeros(List<Numero> numeros) {
		this.numeros = numeros;
	}

	public void addNumero(int id4) {
		numero = id4;
	}

	public List<Segundero> getSegunderos() {
		if (segunderos == null) {
			segunderos = prov.getSegunderosDisponibles();
		}

		return segunderos;
	}

	public void setSegunderos(List<Segundero> segunderos) {
		this.segunderos = segunderos;
	}

	public void addSegundero(int id5) {
		segundero = id5;
	}

	public void comprar() {
		prov.restaCaja(caja);
		cajas = null;
		prov.restaCorrea(correa);
		correas = null;
		prov.restaEsfera(esfera);
		esferas = null;
		prov.restaNumero(numero);
		numeros = null;
		prov.restaSegundero(segundero);
		segunderos = null;

	}
}
