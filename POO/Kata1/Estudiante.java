package POO.Kata1;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    void mostrarInfo(){
        System.out.println("Estudiante: " + nombre + " " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion);
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    void subirCalificacion(double puntos){
        if (this.calificacion + puntos > 10){
            System.out.println("ERROR. Superar el maximo puntaje. (10)");
        }else this.calificacion = this.calificacion + puntos;

    }

    void bajarCalificacion(double puntos){
        if (this.calificacion - puntos < 0){
            System.out.println("ERROR. Supera la nota minima permitida (0). ");
        }else this.calificacion = this.calificacion - puntos;

    }
}
