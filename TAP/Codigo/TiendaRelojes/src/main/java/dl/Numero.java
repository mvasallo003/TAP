package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Numeros database table.
 * 
 */
@Entity
@Table(name="Numeros")
@NamedQueries({
	@NamedQuery(name="Numero.findAll", query="SELECT n FROM Numero n"),
	@NamedQuery(name="Numero.findFull", query="SELECT n FROM Numero n WHERE n.cantidad >0")
})

public class Numero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNumeros;

	@Column(name="Cantidad")
	private int cantidad;

	@Column(name="Colores")
	private String colores;

	@Column(name="Formato")
	private String formato;

	//uni-directional many-to-one association to General
	@ManyToOne
	@JoinColumn(name="General_idGeneral")
	private General general;

	public Numero() {
	}

	public int getIdNumeros() {
		return this.idNumeros;
	}

	public void setIdNumeros(int idNumeros) {
		this.idNumeros = idNumeros;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getColores() {
		return this.colores;
	}

	public void setColores(String colores) {
		this.colores = colores;
	}

	public String getFormato() {
		return this.formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public General getGeneral() {
		return this.general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

}