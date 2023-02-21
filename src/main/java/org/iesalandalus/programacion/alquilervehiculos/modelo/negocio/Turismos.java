package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;

public class Turismos {
	private Object coleccionTurismos;

	public Turismos() {
		ArrayList coleccionTurismos = new ArrayList<>();
	}
	
	public Turismos(Turismos turismos) {
		setTurismos(turismos);
	}

	private void setTurismos(Turismos turismos) {
		if (turismos == null) {
			throw new IllegalArgumentException("No se pueden copiar turismos nulos.");
		}
		Object coleccionTurismos = copiaProfundaTurismos(turismos.coleccionTurismos);
}
	private Object copiaProfundaTurismos(Object coleccionTurismos) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Turismo> copiaProfundaTurismos(List<Turismos> turismos) {
		List<Turismo> otrosTurismos = new ArrayList<>();
		for (Turismos turismo: turismos) {
			otrosTurismos.addAll((Collection<? extends Turismo>) turismo);
		}
		return otrosTurismos;
	}
	
	public Object getTurismos() {
		return copiaProfundaTurismos(coleccionTurismos);
	}
	
	public int getCantidad() {
		return ((ArrayList) coleccionTurismos).size();
	}
	
	public void insertar(Turismo turismo) throws OperationNotSupportedException {
		if (turismo == null) {
			throw new IllegalArgumentException("No se puede insertar un turismo nulo.");
		}
		if (((ArrayList) coleccionTurismos).contains(turismo)) {
			throw new OperationNotSupportedException("El turismo ya existe.");
		} else {
			((ArrayList) coleccionTurismos).add(new Turismo(turismo));
		}
	}
	
	public Turismo buscar(Turismo turismo) { 
		int indice = ((ArrayList) coleccionTurismos).indexOf(turismo);
		if (indice != -1) {
			return new Turismo((Turismo) ((ArrayList) coleccionTurismos).get(indice));
		} else {
			return null;
		}
	}
	public void borrar(Turismo turismo) throws OperationNotSupportedException {
		if (turismo == null) {
			throw new IllegalArgumentException("No se puede borrar un turismo nulo.");
		}
		if (!((ArrayList) coleccionTurismos).remove(turismo)) {
			throw new OperationNotSupportedException("El turismo a borrar no existe.");
		}
	}
}
