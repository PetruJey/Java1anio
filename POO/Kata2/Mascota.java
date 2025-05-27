package POO.Kata2;

public class Mascota {
    String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre + "\nEspecie: " + this.especie + "\nEdad: " + this.edad);
    }

    void cumplirAnios(){
        this.edad = this.edad + 1;
    }
}
