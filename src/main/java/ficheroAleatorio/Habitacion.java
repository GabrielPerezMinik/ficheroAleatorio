package ficheroAleatorio;

public class Habitacion {

	int codHabitacion;
	String codHotel;
	String numHabitacion;
	int capacidad;
	int precio;
	boolean activa;
	
	public int getCodHabitacion() {
		return codHabitacion;
	}
	public void setCodHabitacion(int codHabitacion) {
		this.codHabitacion = codHabitacion;
	}
	public String getCodHotel() {
		return codHotel;
	}
	public void setCodHotel(String codHotel) {
		this.codHotel = codHotel;
	}
	public String getNumHabitacion() {
		return numHabitacion;
	}
	public void setNumHabitacion(String numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s, %s, %d, %d, %s", codHabitacion,codHotel,numHabitacion,capacidad,precio,activa);
	}
	
	
}
