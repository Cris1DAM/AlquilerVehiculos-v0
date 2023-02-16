package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;

public class Clientes {
		private static final boolean ISBLANK = true;
		private Object coleccionClientes;

		public Clientes() {
			ArrayList coleccionClientes = new ArrayList<>();
		}
		
		public Clientes(Clientes clientes) {
			setClientes(clientes);
		}
		
		private void setClientes(Clientes clientes) {
			if (clientes == null) {
				throw new IllegalArgumentException("No se pueden copiar clientes nulos.");
			}
			Object coleccionClientes = copiaProfundaClientes(clientes.coleccionClientes);
	}
		private Object copiaProfundaClientes(Object coleccionClientes2) {
			return null;
		}
		private List<Cliente> copiaProfundaClientes(List<Clientes> clientes) {
			List<Cliente> otrosClientes = new ArrayList<>();
			for (Clientes cliente: clientes) {
				otrosClientes.addAll((Collection<? extends Cliente>) cliente);
			}
			return otrosClientes;
		}
		
		public Object getClientes() {
			return copiaProfundaClientes(coleccionClientes);
		}
		
		public int getCantidad() {
			return ((ArrayList) coleccionClientes).size();
		}
		
		public void insertar(Cliente cliente) throws OperationNotSupportedException {
			if (cliente == null) {
				throw new IllegalArgumentException("No se puede insertar un cliente nulo.");
			}
			if (((ArrayList) coleccionClientes).contains(cliente)) {
				throw new OperationNotSupportedException("El cliente ya existe.");
			} else {
				((ArrayList) coleccionClientes).add(new Cliente(cliente));
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
		public void borrar(Cliente cliente) throws OperationNotSupportedException {
			if (cliente == null) {
				throw new IllegalArgumentException("No se puede borrar un cliente nulo.");
			}
			if (!((ArrayList) coleccionClientes).remove(cliente)) {
				throw new OperationNotSupportedException("El cliente a borrar no existe.");
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
					nombre.isBlank();
					telefono.isBlank();
		
					}
				 
				}	
				}

