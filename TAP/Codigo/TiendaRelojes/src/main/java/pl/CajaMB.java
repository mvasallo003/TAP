package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dl.Caja;

@Named
@RequestScoped
public class CajaMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Caja entity = new Caja();

	public Caja getEntity() {
		return entity;
	}
}
