package paddle;

public class Jugador {
    private String nombre;
    private int edad;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}