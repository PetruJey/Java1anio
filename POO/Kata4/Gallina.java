package POO.Kata4;

public class Gallina {
    private int id;
    private int edad;
    private int huevosPuestos;

    public Gallina(int id, int edad, int huevosPuestos) {
        this.id = id;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(){
        this.huevosPuestos += 1;
    }

    public void envejecer(){
        this.edad += 1;
    }

    public void mostrarEstado(){
        System.out.println("Gallina: " + this.id);
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos Puestos: " + this.huevosPuestos);
    }
}
