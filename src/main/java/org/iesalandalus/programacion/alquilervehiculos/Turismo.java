package org.iesalandalus.programacion.alquilervehiculos;

import java.util.Objects;

public class Turismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		private static String ER_MARCA = "[A-ZÁÉÍÓÚÜÑ][a-záéíóúÜñ]+([][A-ZÁÉÍÓÚÜÑ][a-záéíóúÜñ]+)*";
		private static String ER_MATRICULA = "^[A-Z]*-\\\\d{4}*-[A-Z]{3}$";
		private String marca = "Seat";
		private String modelo;
		private int cilindrada = 0 - 5000;
		private String matricula = "1111BBB";
		
		public Turismo (String marca, String modelo, int cilindrada, String matricula) {
			setMarca(marca);
			setModelo(modelo);
			setCilindrada(cilindrada);
			setMatricula(matricula);
		}
			
		public Turismo (Turismo turismo) {
			 if (turismo == null) {
				 throw new NullPointerException("ERROR: No es posible copiar un turismo:");
				}
			 setMarca(turismo.marca);
			 setModelo(turismo.modelo);
			 setCilindrada(turismo.cilindrada);
			 setMatricula(turismo.matricula);
		}
		public boolean getTurismoconMatricula (String matricula) {
			return matricula.matches("^[0-9]{4}[A-Z]{3}$");
		 
		}
		
		public String getMarca() {
			return marca;
		}

		public String getModelo() {
			return modelo;
		}

		public int getCilindrada() {
			return cilindrada;
		}

		public String getMatricula() {
			return matricula;
		}
		

		@Override
		public int hashCode() {
			return Objects.hash(cilindrada, marca, matricula, modelo);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Turismo other = (Turismo) obj;
			return cilindrada == other.cilindrada && Objects.equals(marca, other.marca)
					&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo);
		}

		@Override
		public String toString() {
			return "Turismo [marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", matricula="
					+ matricula + "]";
		}

		private void setMatricula(String matricula2) {
			// TODO Auto-generated method stub
			
		}

		private void setCilindrada(int cilindrada2) {
			// TODO Auto-generated method stub
			
		}

		private void setModelo(String modelo2) {
			// TODO Auto-generated method stub
			
		}

		private void setMarca(String marca2) {
			// TODO Auto-generated method stub
			
		}
}
