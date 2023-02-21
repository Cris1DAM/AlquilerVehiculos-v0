package org.iesalandalus.programacion.alquilervehiculos.vista;

import java.time.format.DateTimeFormatter;

import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Clientes;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private String PATRON_FECHA = new String ("h 'horas' m 'minutos' s 'segundos' a");
	private DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("h 'horas' m 'minutos' s 'segundos' a");
	
	private Consola() {
	}
	
	public static void mostrarMenu() {
		mostrarCabecera("Alquiler de Vehiculos");
		for (Opcion opcion: Opcion.values()) {
			System.out.println(opcion);
		}
	}
	
	public static void mostrarCabecera(String mensaje) {
		System.out.printf("%n%s%n", mensaje);
		String cadena = "%0" + mensaje.length() + "d%n";
		System.out.println(String.format(cadena, 0).replace("0", "-"));
	}
	
	public static int elegirOpcion() {
		int ordinalOpcion;
		do {
			System.out.print("\nElige una opción: ");
			ordinalOpcion = Entrada.entero();
		} while (!Opcion.esOrdinalValido(ordinalOpcion));
		return ordinalOpcion;
	}
	
	public static void leerCliente() {
		System.out.print("Introduce el nombre: ");
		String nombre = Entrada.cadena();
		System.out.print("Introduce los apellidos: ");
		String apellidos = Entrada.cadena();
		System.out.print("Introduce el dni: ");
		String dni = Entrada.cadena();
		System.out.print("Introduce el teléfono: ");
		String telefono = Entrada.cadena();
		System.out.print("Introduce la fecha de nacimiento: ");
		String fechaNacimiento = Entrada.cadena();
		System.out.print("Introduce el correo: ");
		String correo = Entrada.cadena();
		System.out.print("Introduce la dirección: ");
		String direccion = Entrada.cadena();
		System.out.print("Introduce la localidad: ");
		String localidad = Entrada.cadena();
		System.out.print("Introduce el código postal: ");
		String codigoPostal = Entrada.cadena();
	}
	
	public static void leerDniCliente() {
		String dni;
		do {
			System.out.print("Introduce el dni: ");
			dni = Entrada.cadena();
		} while (dni.trim().equals(""));
	}
}
