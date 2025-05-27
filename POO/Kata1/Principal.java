package POO.Kata1;

public class Principal {
    public static void main (String[] args){
        Estudiante estudiante1 = new Estudiante("Jeremias", "Montiel", "1PROG3", 8.85);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(10);
        estudiante1.subirCalificacion(1.15);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(20);
        estudiante1.bajarCalificacion(2.1);
        estudiante1.mostrarInfo();


    }
}
