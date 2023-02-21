package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
public class Alquileres {
	
	private List<Alquileres> coleccionAlquileres;

	public Alquileres() {
		ArrayList coleccionAlquileres = new ArrayList<>();
	}
	
	public Alquileres(Alquileres alquileres) {
		setAlquileres(alquileres);
	}

	private void setAlquileres(Alquileres alquileres) {
		if (alquileres == null) {
			throw new IllegalArgumentException("No se pueden copiar alquileres nulos.");
		}
		Object coleccionAlquileres = copiaProfundaAlquileres(alquileres.coleccionAlquileres);
}
	private Object copiaProfundaClientes(Object coleccionClientes) {
		return null;
	}
	private List<Alquiler> copiaProfundaAlquileres(List<Alquileres> alquileres) {
		List<Alquiler> otrosAlquileres = new ArrayList<>();
		for (Alquileres alquiler: alquileres) {
			otrosAlquileres.addAll((Collection<? extends Alquiler>) alquiler);
		}
		return otrosAlquileres;
	}
	
	public Object getAlquileres() {
		Object coleccionAlquileres = null;
		return copiaProfundaAlquileres((List<Alquileres>) coleccionAlquileres);
	}
	public Object getCliente; List<Alquiler> cliente() {
		Object coleccionAlquileres = null;
		return copiaProfundaAlquileres((List<Alquileres>) coleccionAlquileres);
	}
	
	public Object getTurismo; List<Alquiler> turismo() {
		Object coleccionAlquileres = null;
		return copiaProfundaAlquileres((List<Alquileres>) coleccionAlquileres);
	}
	
	public int getCantidad() {
		ArrayList coleccionAlquileres = null;
		return ((ArrayList) coleccionAlquileres).size();
	}
	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		if (alquiler == null) {
			throw new IllegalArgumentException("No se puede insertar un alquiler nulo.");
		}
		if (((ArrayList) coleccionAlquileres).contains(alquiler)) {
			throw new OperationNotSupportedException("El alquiler ya existe.");
		} else {
			((ArrayList) coleccionAlquileres).add(new Alquiler(alquiler));
		}
	}
	
	private void comprobarAlquiler(Cliente cliente, Turismo turismo, LocalDate fechaAlquiler) throws OperationNotSupportedException {
		if (!(fechaAlquiler == null)) {
			 throw new OperationNotSupportedException("ERROR: No es posible devolver:");
			 } else {
		if (cliente == null) {
			throw new IllegalArgumentException("No es posible devolver un cliente.");
	         } else  {
	    if (turismo == null) {
	    	throw new IllegalArgumentException("No es posible devolver un turismo.");
	    }
	         }
			 }
	}
	
	public void devolver(LocalDate fechaDevolucion, Cliente cliente) throws OperationNotSupportedException {
		if (!(fechaDevolucion == null)) {
			 throw new OperationNotSupportedException("ERROR: No es posible devolver:");
			 } else {
		if (cliente == null) {
			throw new IllegalArgumentException("No es posible devolver un cliente.");
		}
			 }
	}

	
	public Alquiler buscar(Alquiler alquiler) { 
		int indice = ((ArrayList) coleccionAlquileres).indexOf(alquiler);
		if (indice != -1) {
			return new Alquiler((Alquiler) ((ArrayList) coleccionAlquileres).get(indice));
		} else {
			return null;
		}
	}
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		if (alquiler == null) {
			throw new IllegalArgumentException("No se puede borrar un alquiler nulo.");
		}
		if (!((ArrayList) coleccionAlquileres).remove(alquiler)) {
			throw new OperationNotSupportedException("El alquiler a borrar no existe.");
		}
	}
}

