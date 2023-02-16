package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
		
		private static final String ER_NOMBRE = "[A-ZÁÉÍÓÚÜÑ][a-záéíóúÜñ]+([][A-ZÁÉÍÓÚÜÑ][a-záéíóúÜñ]+)*";
		private static final String ER_DNI = "([0-9]{8}([A-Za-z])";
		private static final String ER_TELEFONO = "[96][0-9]{8}";
		private String nombre;
		private String dni;
		private String telefono;
		
		public Cliente (String nombre, String dni, String telefono) {
			setNombre(nombre);
			setDni(dni);
			setTelefono(telefono);
		}
			public Cliente (Cliente cliente) {
				 if (cliente == null) {
					 throw new NullPointerException("ERROR: No es posible copiar un cliente mio:");
					}
				 setNombre(cliente.nombre);
				 setDni(cliente.dni);
				 setTelefono(cliente.telefono);
			}
			private void setNombre(Object nombre2) {
				// TODO Auto-generated method stub
				
			}
			private void setDni(Object dni2) {
				// TODO Auto-generated method stub
				
			}
			private void setTelefono(Object telefono2) {
				// TODO Auto-generated method stub
				
			}
			private String comprobarLetraDni() {
				int miDNI = Integer.parseInt(this.dni.substring(0, 8));
				int resto = 0;
				String miLetra = "";
				String[] asginacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
				resto = miDNI % 23;
				miLetra = asginacionLetra[resto];
				return miLetra;
			}
			public Object getNombre() {
				return nombre;
			}

			public Object getDni() {
				return dni;
			}

			public Object getTelefono() {
				return telefono;
			}
			public static void getClienteconDni() {
				
			}
			    public static void main(String[] args) {
			        String dniIntroducido = null;
			        Scanner miScanner = new Scanner(System.in);
			        Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
			        System.out.print("Introduce un DNI correcto: ");
			        dniIntroducido = miScanner.nextLine();
			        Matcher mat = patron.matcher(dniIntroducido);
			        while(!mat.matches()){
			           System.out.println("El DNI introducido es incorrecto, por favor introduzca un DNI válido.");
			           System.out.print("Introduce un DNI correcto: ");
			           dniIntroducido = miScanner.nextLine();
			           mat = patron.matcher(dniIntroducido);
			        }
			        }
			@Override
			public int hashCode() {
				return Objects.hash(dni, nombre, telefono);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Cliente other = (Cliente) obj;
				return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
						&& Objects.equals(telefono, other.telefono);
			}
			@Override
			public String toString() {
				return "Cliente [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
			}
			public void Nombre(String nombre) {
				this.nombre = nombre;
			}
			public void Dni(String dni) {
				this.dni = dni;
			}
			public void Telefono(String telefono) {
				this.telefono = telefono;
			}
			public static Cliente getClienteConDni(String dniValido) {
				// TODO Auto-generated method stub
				return null;
			}
			public static String getErNombre() {
				return ER_NOMBRE;
			}
			public static String getErDni() {
				return ER_DNI;
			}
			public static String getErTelefono() {
				return ER_TELEFONO;
			}
}
