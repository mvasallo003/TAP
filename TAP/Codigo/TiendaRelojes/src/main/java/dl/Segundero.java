package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Segundero database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Segundero.findAll", query="SELECT s FROM Segundero s"),
	@NamedQuery(name="Segundero.findFull", query="SELECT s FROM Segundero s WHERE s.cantidad >0")
})
public class Segundero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSegundero;

	@Column(name="Cantidad")
	private int cantidad;

	@Column(name="Color")
	private String color;

	//uni-directional many-to-one association to General
	@ManyToOne
	@JoinColumn(name="General_idGeneral")
	private General general;

	public Segundero() {
	}

	public int getIdSegundero() {
		return this.idSegundero;
	}

	public void setIdSegundero(int idSegundero) {
		this.idSegundero = idSegundero;
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

	public General getGeneral() {
		return this.general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

}