package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the General database table.
 * 
 */
@Entity
@NamedQuery(name="General.findAll", query="SELECT g FROM General g")
public class General implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGeneral;

	public General() {
	}

	public int getIdGeneral() {
		return this.idGeneral;
	}

	public void setIdGeneral(int idGeneral) {
		this.idGeneral = idGeneral;
	}

}