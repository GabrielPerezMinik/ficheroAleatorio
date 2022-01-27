package ficheroAleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero {

	static RandomAccessFile fileram;
	final static int TAMANOREGISTRO = 45;

	public static void anadirFichero(Habitacion habitacion) throws IOException {

		
		
		if(fileram.length()>=45) {
		fileram.seek(fileram.length() - TAMANOREGISTRO);
		int autoIncremento = fileram.readInt();
		fileram.seek(fileram.length());
		fileram.writeInt(autoIncremento + 1);
		}
		else {
			fileram.writeInt(0);
		}
		fileram.writeChar(',');
		fileram.writeChars(habitacion.getCodHotel());
		fileram.writeChar(',');
		fileram.writeChars(habitacion.getNumHabitacion());
		fileram.writeChar(',');
		fileram.writeInt(habitacion.getCapacidad());
		fileram.writeChar(',');
		fileram.writeInt(habitacion.getPrecio());
		fileram.writeChar(',');
		fileram.writeBoolean(habitacion.isActiva());
		fileram.writeChar(',');

	}
	
	static public void leerIndice(int indice) throws IOException{
		String codHotel=new String();
		String numHabitacion=new String();
		Habitacion habitacion=new Habitacion();
		
		fileram.seek((indice-1)*45);
		
		habitacion.setCodHabitacion(fileram.readInt());
		fileram.readChar();
		
		for (int i = 0; i < 5; i++) {
			codHotel+=fileram.readChar();
		}
		habitacion.setCodHotel(codHotel);
		fileram.readChar();
		for (int i = 0; i < 4; i++) {
			 numHabitacion += fileram.readChar();
		}
		habitacion.setNumHabitacion(numHabitacion);
		fileram.readChar();
		habitacion.setCapacidad(fileram.readInt());
		fileram.readChar();
		habitacion.setPrecio(fileram.readInt());
		fileram.readChar();
		habitacion.setActiva(fileram.readBoolean());
		fileram.readChar();
		
		System.out.println(habitacion);
	}
	

	public static void main(String[] args) throws IOException {
		
		fileram=new RandomAccessFile("bdHoteles", "rw");
		
		leerIndice(3);
		
		Habitacion habitacion1=new Habitacion();
		Habitacion habitacion2=new Habitacion();
		Habitacion habitacion3=new Habitacion();
		
		
//		habitacion1.setCodHotel("123456");
//		habitacion1.setCapacidad(10);
//		habitacion1.setPrecio(42);
//		habitacion1.setNumHabitacion("3445");
//		habitacion1.setActiva(false);
//		
//		habitacion2.setCodHotel("456684");
//		habitacion2.setCapacidad(10);
//		habitacion2.setPrecio(42);
//		habitacion2.setNumHabitacion("3478");
//		habitacion2.setActiva(true);
//		
//		habitacion3.setCodHotel("123457");
//		habitacion3.setCapacidad(10);
//		habitacion3.setPrecio(42);
//		habitacion3.setNumHabitacion("1234");
//		habitacion3.setActiva(true);
//		
//		anadirFichero(habitacion1);
//		anadirFichero(habitacion2);
//		anadirFichero(habitacion3);
		
		
		// el seek se situa en la direccion de memoria que le pongas en bytes
		// el puntero apunta en la direccion de memoria por defecto 0

//		  fileram.seek(fileram.length());
//		  
//		  fileram.writeInt(1); fileram.writeChar(','); fileram.writeChars("axolot");
//		  fileram.writeChar(','); fileram.writeChars("1234"); fileram.writeChar(',');
//		  fileram.writeInt(4); fileram.writeChar(','); fileram.writeInt(4);
//		  fileram.writeChar(','); fileram.writeBoolean(true); fileram.writeChar(',');
//		 

	}

}
