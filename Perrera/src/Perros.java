
public class Perros {
	private String nombre;
	private String raza;
	private String localidad;
	private String dueño;
	private String cedula;
	private String telefono;
	private String dia;


	public Perros(){
		nombre = "";
		raza = "";
		localidad = "";
		dueño = "";
		cedula = "";
		telefono = "";
		dia = "";
	}
	public Perros(String n, String r, String l, String d, String c, String t, String di) {
		nombre = n;
		raza = r;
		localidad = l;
		dueño = d;
		cedula = c;
		telefono = t;
		dia = di;
	}
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getDueño() {
		return dueño;
	}


	public void setDueño(String dueño) {
		this.dueño = dueño;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}
	
}

