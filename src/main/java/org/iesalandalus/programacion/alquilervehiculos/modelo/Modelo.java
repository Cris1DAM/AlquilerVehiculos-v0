package org.iesalandalus.programacion.alquilervehiculos.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Alquileres;

public class Modelo {
		
	private ArrayList coleccionClientes;
	private ArrayList coleccionTurismos;
	private ArrayList coleccionAlquileres;
	private Modelo negocio;
	private Modelo modelo;

	public Modelo() {
		ArrayList coleccionModelo = new ArrayList<>();
	}
	public void comenzar() {
		modelo.comenzar();
		negocio.comenzar();
	}
	public void terminar() {
		modelo.terminar();
		System.out.println("Adiós!!!");
	}
	public void insertar(Cliente cliente) throws OperationNotSupportedException {
		if (cliente == null) {
			throw new IllegalArgumentException("No se puede insertar un cliente nulo.");
		}
		if (coleccionClientes.contains(cliente)) {
			throw new OperationNotSupportedException("El cliente ya existe.");
		} else {
			coleccionClientes.add(new Cliente(cliente));
		}
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
	public Cliente buscar(Cliente cliente) { 
		int indice = ((ArrayList) coleccionClientes).indexOf(cliente);
		if (indice != -1) {
			return new Cliente((Cliente) ((ArrayList) coleccionClientes).get(indice));
		} else {
			return null;
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
	
	public Alquiler buscar(Alquiler alquiler) { 
		int indice = ((ArrayList) coleccionAlquileres).indexOf(alquiler);
		if (indice != -1) {
			return new Alquiler((Alquiler) ((ArrayList) coleccionAlquileres).get(indice));
		} else {
			return null;
		}
	}
	public void modificar (Cliente cliente, String nombre, String telefono) {
		if (cliente == null) {
			throw new IllegalArgumentException("No se puede modificar un cliente nulo.");
		} else {
		if (nombre == null) {
			throw new IllegalArgumentException("No se puede modificar un nombre nulo.");
		} else {
		if (telefono == null) {
			throw new IllegalArgumentException("No se puede modificar un telefono nulo.");
		}
		}
		}
	}
	public void devolver(LocalDate fechaDevolucion, Alquiler alquiler) throws OperationNotSupportedException {
		if (!(fechaDevolucion == null)) {
			 throw new OperationNotSupportedException("ERROR: No es posible devolver:");
			 } else {
		if (alquiler == null) {
			throw new IllegalArgumentException("No es posible devolver un alquiler.");
		}
			 }
	}
	
	public void borrar(Cliente cliente) throws OperationNotSupportedException {
		if (cliente == null) {
			throw new IllegalArgumentException("No se puede borrar un cliente nulo.");
		}
		if (!((ArrayList) coleccionClientes).remove(cliente)) {
			throw new OperationNotSupportedException("El cliente a borrar no existe.");
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
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		if (alquiler == null) {
			throw new IllegalArgumentException("No se puede borrar un alquiler nulo.");
		}
		if (!((ArrayList) coleccionAlquileres).remove(alquiler)) {
			throw new OperationNotSupportedException("El alquiler a borrar no existe.");
		}
	}
	public Object getClientes() {
		return copiaProfundaClientes(coleccionClientes);
	}
	private Object copiaProfundaClientes(ArrayList coleccionClientes2) {
		return null;
	}
	public Object getTurismos() {
		return copiaProfundaTurismos(coleccionTurismos);
	}
	private Object copiaProfundaTurismos(ArrayList coleccionTurismos2) {
		return null;
	}
	public Object getAlquileres() {
		Object coleccionAlquileres = null;
		return copiaProfundaAlquileres((List<Alquileres>) coleccionAlquileres);
	}
	private Object copiaProfundaAlquileres(List<Alquileres> coleccionAlquileres2) {
		return null;
	}
	public Object getAlquileres(Cliente cliente) {
		Object coleccionAlquileres = null;
		return copiaProfundaAlquileres((List<Alquileres>) coleccionAlquileres);
	}
	public Object getAlquileres(Turismo turismo) {
		Object coleccionAlquileres = null;
		return copiaProfundaAlquileres((List<Alquileres>) coleccionAlquileres);
	}
}

