import java.util.ArrayList;
import java.util.Scanner;

public class Perrera {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Perros> dogs = new ArrayList<Perros>();
	static String nombre;
	static String raza;
	static String localidad;
	static String dueño;
	static String cedula;
	static String telefono;
	static String dia;
	
	public static void lista() {
		
		nombre = "Francy";
		raza = "Pincher";
		localidad = "Suba";
		dueño = "Camilo Perez"; 
		cedula = "51896234";
		telefono = "6150978";
		dia = "Lunes, Miercoles, Viernes";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));

		nombre = "Frank";
		raza = "Doberman";
		localidad = "Chia";
		dueño = "Franco Ferreira";
		cedula = "5369841";
		telefono = "6197539";
		dia = "Martes, Jueves, Sabados, Domingos";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Juanito";
		raza = "Alaskan malamuth";
		localidad = "Suba";
		dueño = "Santiago Pelaez";
		cedula = "57856321";
		telefono = "6142965";
		dia = "Lunes, Martes, Viernes, Domingos";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Sanson";
		raza = "Bull terrier";
		localidad = "Usaquen";
		dueño = "Juan Ramirez";
		cedula = "5796354";
		telefono = "3458971";
		dia = "Lunes, Jueves, Sabados";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Apolo";
		raza = "Huskey Siberiano";
		localidad = "Suba";
		dueño = "Andrea Fernandez";
		cedula = "102698456";
		telefono = "6150179";
		dia = "Martes, Viernes, Domingos";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Percy";
		raza = "Gran Daness";
		localidad = "Chia";
		dueño = "Gabriel Jaramillo";
		cedula = "29875634";
		telefono = "8963541";
		dia = "Todos los dias";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Roly";
		raza = "Fench puddle";
		localidad = "Cajica";
		dueño = "Rene Sanchez";
		cedula = "1032589654";
		telefono = "8756314";
		dia = "Jueves, viernes";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Franchesco";
		raza = "Pitbull";
		localidad = "Cajica";
		dueño = "Ronald Cardenas";
		cedula = "58964735";
		telefono = "5418796";
		dia = "Todos los dias";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Florian";
		raza = "French puddle";
		localidad = "Usaquen";
		dueño = "Jaime Becerra";
		cedula = "1035963574";
		telefono = "9856214";
		dia = "Lunes, Miercoles, Viernes";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		
		nombre = "Jason";
		raza = "Tasita de té";
		localidad = "Cajica";
		dueño = "Jeronimo Diaz";
		cedula = "108964785";
		telefono = "6153687";
		dia = "Lunes, Martes, jueves, Viernes";
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
	}
	
	public static void main(String[] args) {
		lista();
		int dato = 9; 
		System.out.println(".::Guarderia DE TITO::.");
		System.out.println("");
		System.out.println("");
		do {
		System.out.println("1. Ver la lista de perros inscritas");
		System.out.println("2. Agregar nuevo perro");
		System.out.println("3. Ver los perros por localidad para asignarlos a los conductores");
		System.out.println("0. Para salir del programa.");
		dato = teclado.nextInt();
		
		switch (dato){
			case 1:
				verLista();
				break;
			case 2:
				agregarPerro();
				break;
			case 3:
				localidadPerros();
				break;
		}		
		}while (dato !=0);
	}
	
	public static void verLista() {
		System.out.println("| NOMBRE   |   RAZA    |      LOCALIDA     | NOMBRE DEL DUEÑO  |  CEDULA DEL DUEÑO |  TELEFONO DEL DUEÑO   |  DIAS DE ASISTENCIA   |");
		for (int i=0; i<dogs.size(); i++) {
			System.out.println("");
			System.out.println("|  " +dogs.get(i).getNombre() +"  |  "+ dogs.get(i).getRaza() +"  |  "+ dogs.get(i).getLocalidad() +"  |  "+ dogs.get(i).getDueño() +"  |  "+ dogs.get(i).getCedula() +"  |  "+ dogs.get(i).getTelefono() +"  |  "+ dogs.get(i).getDia() + "  |");
			System.out.println("");
		}			
	}
	
	public static void agregarPerro() {
		
		System.out.println("Ingrese el nombre del perro.");
		nombre = teclado.next();
		System.out.println("Ingrese la raza del perro.");
		raza = teclado.next();
		System.out.println("En que localidad se ubica el perro.");
		localidad = teclado.next();
		teclado.nextLine();
		System.out.println("Ingrese el nombre del dueño del perro.");
		dueño = teclado.nextLine();
		System.out.println("Ingrese el numero de cedula del dueño");
		cedula = teclado.next();
		System.out.println("Ingrese el numero de telefono del dueño");
		telefono = teclado.next();
		teclado.nextLine();
		System.out.println("Que dias va a asistir el perro a la Guarderia");
		dia = teclado.nextLine();
		System.out.println("");
		dogs.add(new Perros(nombre, raza, localidad, dueño, cedula, telefono, dia));
		int n = dogs.size() - 1; 
		System.out.println("| NOMBRE   |   RAZA    |      LOCALIDA     | NOMBRE DEL DUEÑO  |  CEDULA DEL DUEÑO |  TELEFONO DEL DUEÑO   |  DIAS DE ASISTENCIA   |");
		System.out.println("");
		System.out.println("|  " +dogs.get(n).getNombre() +"  |  "+ dogs.get(n).getRaza() +"  |  "+ dogs.get(n).getLocalidad() +"  |  "+ dogs.get(n).getDueño() +"  |  "+ dogs.get(n).getCedula() +"  |  "+ dogs.get(n).getTelefono() +"  |  "+ dogs.get(n).getDia() + "  |");
		System.out.println("");
	}
	
	public static void localidadPerros() {
		
		ArrayList<String> local = new ArrayList<String>();
		System.out.println("Tenemos perros ubicado en las siguientes localidades.");
		for (int i=0; i<dogs.size(); i++) {
			local.add(dogs.get(i).getLocalidad());
		}
		
		for (int i=0; i<local.size(); i++) {
			for (int j=i+1; j<local.size(); j++) {
				if (local.get(i).equals(local.get(j))) {
					local.remove(j);
				}
			}			
		}
		int q = local.size() - 1;
		int w = local.size() - 2;
		if (local.get(q).equals(local.get(w))) {
			local.remove(q);
		}
		for (int i=0; i<local.size(); i++) {
			System.out.println(local.get(i));
		}
		String loc;
		System.out.println("");
		System.out.println("Ingrese la localidad que desea buscar.");
		loc = teclado.next();
		for (int i=0; i<dogs.size(); i++) {
			if(dogs.get(i).getLocalidad().equals(loc)) {
				System.out.println("|  " +dogs.get(i).getNombre() +"  |  "+ dogs.get(i).getRaza() +"  |  "+ dogs.get(i).getLocalidad() +"  |  "+ dogs.get(i).getDueño() +"  |  "+ dogs.get(i).getCedula() +"  |  "+ dogs.get(i).getTelefono() +"  |  "+ dogs.get(i).getDia() + "  |");
				System.out.println("");
			}
		}
		
	}

}