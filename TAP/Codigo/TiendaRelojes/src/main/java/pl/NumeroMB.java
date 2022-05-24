package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dl.Numero;

@Named
@RequestScoped
public class NumeroMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Numero entity = new Numero();

	public Numero getEntity() {
		return entity;
	}
}
