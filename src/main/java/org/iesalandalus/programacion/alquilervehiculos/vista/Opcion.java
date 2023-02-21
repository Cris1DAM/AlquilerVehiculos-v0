package org.iesalandalus.programacion.alquilervehiculos.vista;

public enum Opcion {
	SALIR,
	INSERTAR_CLIENTE,
	INSERTAR_TURISMO,
	INSERTAR_ALQUILER,
	BUSCAR_CLIENTE,
	BUSCAR_TURISMO,
	BUSCAR_ALQUILER,
	MODIFICAR_CLIENTE,
	DEVOLVER_ALQUILER,
	BORRAR_CLIENTE,
	BORRAR_TURISMO,
	BORRAR_ALQUILER,
	LISTAR_CLIENTES,
	LISTAR_TURISMOS,
	LISTAR_ALQUILERES,
	LISTAR_ALQUILERES_CLIENTE,
	LISTAR_ALQUILERES_TURISMO;
	
	@Override
	public String toString() {
		return String.format("%d.- %s", ordinal());
	}
	
	public static Opcion getOpcionSegunOrdinal(int ordinal) {
		if (esOrdinalValido(ordinal))
			return values()[ordinal];
		else
			throw new IllegalArgumentException("Ordinal de la opción no válido");
	}
	
	public static boolean esOrdinalValido(int ordinal) {
		return (ordinal >= 0 && ordinal <= values().length - 1);
	}
	public int get(int ordinal) {
		return ordinal;
	}
}
