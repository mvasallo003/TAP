package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dl.Correa;

@Named
@RequestScoped
public class CorreaMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Correa entity = new Correa();

	public Correa getEntity() {
		return entity;
	}
}
