
public class Alumno {
private String nombre;
private String apellido;
private String edad;
private String nota;
public Alumno ()
{
	nombre= "";
	apellido= "";
	edad= "";
	nota=" ";
}

	public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getEdad() {
	return edad;
}

public void setEdad(String edad) {
	this.edad = edad;
}

public String getNota() {
	return nota;
}

public void setNota(String nota) {
	this.nota = nota;
}


	{
	}
	
@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + "]";
}

}