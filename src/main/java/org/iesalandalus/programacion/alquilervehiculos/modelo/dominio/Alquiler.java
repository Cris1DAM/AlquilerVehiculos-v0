package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.naming.OperationNotSupportedException;

public class Alquiler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("d/M/yy");
	DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter formatoTextoLargo = DateTimeFormatter.ofPattern("cccc, d 'de' MMMM 'de' yyyy");
	DateTimeFormatter formatoTextoCorto = DateTimeFormatter.ofPattern("ccc, d 'de' MMM 'de' yyyy");
	private int PRECIO_DIA = 20;
	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolucion;
	private Turismo turismo;
	private Cliente cliente;
	

	public Alquiler (Cliente cliente, Turismo turismo, LocalDate fechaAlquiler) {
		setCliente(cliente);
		setTurismo(turismo);
		setFechaAlquiler(fechaAlquiler);
	}
	
	public Alquiler (Alquiler alquiler) {
		 if (alquiler == null) {
			 throw new NullPointerException("ERROR: No es posible copiar un alquiler:");
			}
		 setFechaAlquiler(alquiler.fechaAlquiler);
		 setFechaDevolucion(alquiler.fechaDevolucion);
	}
	

	public Cliente cliente() {
		return cliente();
	}

	public Turismo turismo() {
		return turismo();
	}
	
	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	private void setFechaDevolucion(LocalDate fechaDevolucion2) {
		// TODO Auto-generated method stub
		
	}

	private void setTurismo(Turismo turismo) {
		// TODO Auto-generated method stub
		
	}


	private void setFechaAlquiler(LocalDate fechaAlquiler2) {
		// TODO Auto-generated method stub
		
	}
		public void devolver(LocalDate fechaDevolucion) throws OperationNotSupportedException {
			if (!(fechaDevolucion == null)) {
				 throw new OperationNotSupportedException("ERROR: No es posible devolver:");
				 }
		}
	
	public int getPrecio() {
		int precioAlquiler;
		if (getFechaDevolucion() == null) {
			precioAlquiler = 0;
		} else {
			int factorCilindrada = (turismo.getCilindrada()) / 10;
			Period numDias = Period.between(fechaAlquiler, fechaDevolucion);
			precioAlquiler = (int) ((PRECIO_DIA + factorCilindrada) * numDias.getDays());
		}
			return precioAlquiler;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PRECIO_DIA, fechaAlquiler, fechaDevolucion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return PRECIO_DIA == other.PRECIO_DIA && Objects.equals(fechaAlquiler, other.fechaAlquiler)
				&& Objects.equals(fechaDevolucion, other.fechaDevolucion);
	}

	@Override
	public String toString() {
		return "Alquiler [PRECIO_DIA=" + PRECIO_DIA + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion="
				+ fechaDevolucion + "]";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
}
