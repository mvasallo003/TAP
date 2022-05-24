package bl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dl.Caja;
import dl.Correa;
import dl.Esfera;
import dl.Numero;
import dl.Segundero;

@LocalBean
@Stateless
public class EJBManager implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager em;

	public List<Correa> getCorreasDisponibles() {
		System.out.println("Saco correas");
		return em.createNamedQuery("Correa.findFull", Correa.class).getResultList();
	}
	
	public void restaCorrea(int id) {
		
		try {
			Correa correa = em.find(Correa.class, id);
			int cant = correa.getCantidad() -1;
			correa.setCantidad(cant);
			em.persist(correa);
		}
		catch(Exception e){
			
		}
	
	}
	
	public List<Caja> getCajasDisponibles() {

		return em.createNamedQuery("Caja.findFull", Caja.class).getResultList();
	}
	
public void restaCaja(int id) {
		
		try {
			Caja caja = em.find(Caja.class, id);
			int cant = caja.getCantidad() -1;
			caja.setCantidad(cant);
			em.persist(caja);
		}
		catch(Exception e){
			
		}
	
	}
	
	public List<Esfera> getEsferasDisponibles() {

		return em.createNamedQuery("Esfera.findFull", Esfera.class).getResultList();
	}
	
public void restaEsfera(int id) {
		
		try {
			Esfera esfera = em.find(Esfera.class, id);
			int cant = esfera.getCantidad() -1;
			esfera.setCantidad(cant);
			em.persist(esfera);
		}
		catch(Exception e){
			
		}
	
	}
	
	public List<Numero> getNumerosDisponibles() {

		return em.createNamedQuery("Numero.findFull", Numero.class).getResultList();
	}
	
	public void restaNumero(int id) {
		
		try {
			 Numero numero = em.find(Numero.class, id);
			int cant = numero.getCantidad() -1;
			numero.setCantidad(cant);
			em.persist(numero);
		}
		catch(Exception e){
			
		}
	
	}
	
	public List<Segundero> getSegunderosDisponibles() {

		return em.createNamedQuery("Segundero.findFull", Segundero.class).getResultList();
	}
	
		public void restaSegundero(int id) {
		
		try {
			Segundero segundero = em.find(Segundero.class, id);
			int cant = segundero.getCantidad() -1;
			segundero.setCantidad(cant);
			em.persist(segundero);
		}
		catch(Exception e){
			
		}
	
	}
	
	

}
