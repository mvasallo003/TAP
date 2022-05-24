package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dl.Segundero;

@Named
@RequestScoped
public class SegunderoMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final Segundero entity = new Segundero();

	public Segundero getEntity() {
		return entity;
	}

}
