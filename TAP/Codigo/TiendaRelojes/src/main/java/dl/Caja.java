package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Caja database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Caja.findAll", query="SELECT c FROM Caja c"),
	@NamedQuery(name="Caja.findFull", query="SELECT c FROM Caja c WHERE c.cantidad >0")
})
public class Caja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCaja;

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

	public Caja() {
	}

	public int getIdCaja() {
		return this.idCaja;
	}

	public void setIdCaja(int idCaja) {
		this.idCaja = idCaja;
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