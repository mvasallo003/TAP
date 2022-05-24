package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dl.Esfera;

@Named
@RequestScoped
public class EsferaMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Esfera entity = new Esfera();

	public Esfera getEntity() {
		return entity;
	}
}
