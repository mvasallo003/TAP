package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Correa database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Correa.findAll", query="SELECT c FROM Correa c"),
	@NamedQuery(name="Correa.findFull", query="SELECT c FROM Correa c WHERE c.cantidad >0")
})

public class Correa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCorrea;

	@Column(name="Cantidad")
	private int cantidad;

	@Column(name="Color")
	private String color;

	@Column(name="Tipo")
	private String tipo;

	//uni-directional many-to-one association to General
	@ManyToOne
	@JoinColumn(name="General_idGeneral")
	private General general;

	public Correa() {
	}

	public int getIdCorrea() {
		return this.idCorrea;
	}

	public void setIdCorrea(int idCorrea) {
		this.idCorrea = idCorrea;
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

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public General getGeneral() {
		return this.general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

}