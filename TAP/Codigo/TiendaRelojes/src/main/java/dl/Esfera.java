package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Esfera database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Esfera.findAll", query="SELECT e FROM Esfera e"),
	@NamedQuery(name="Esfera.findFull", query="SELECT e FROM Esfera e WHERE e.cantidad >0")
})


public class Esfera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEsfera;

	@Column(name="Cantidad")
	private int cantidad;

	@Column(name="Color")
	private String color;

	@Column(name="Forma")
	private String forma;

	@Column(name="Tamano")
	private String tamano;

	//uni-directional many-to-one association to General
	@ManyToOne
	@JoinColumn(name="General_idGeneral")
	private General general;

	public Esfera() {
	}

	public int getIdEsfera() {
		return this.idEsfera;
	}

	public void setIdEsfera(int idEsfera) {
		this.idEsfera = idEsfera;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return this.forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamano() {
		return this.tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public General getGeneral() {
		return this.general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

}