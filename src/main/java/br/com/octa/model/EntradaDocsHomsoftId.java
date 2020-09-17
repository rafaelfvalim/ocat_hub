package br.com.octa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Embeddable
public class EntradaDocsHomsoftId implements Serializable {

	public String tipo;
	public Date dataDe;
	public Date dataAte;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaDocsHomsoftId other = (EntradaDocsHomsoftId) obj;
		if (dataAte == null) {
			if (other.dataAte != null)
				return false;
		} else if (!dataAte.equals(other.dataAte))
			return false;
		if (dataDe == null) {
			if (other.dataDe != null)
				return false;
		} else if (!dataDe.equals(other.dataDe))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAte == null) ? 0 : dataAte.hashCode());
		result = prime * result + ((dataDe == null) ? 0 : dataDe.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	public EntradaDocsHomsoftId(String tipo, Date dataDe, Date dataAte) {
		this.tipo = tipo;
		this.dataDe = dataDe;
		this.dataAte = dataAte;
	}

	public EntradaDocsHomsoftId() {
	}

}
