package POO.Kata3;

public class Principal {
    public static void main (String[] args){
        Libro libro1 = new Libro("La Perla", "John Steinbeck", 2025);
        libro1.setAnioPublicacion(2027);
        libro1.setAnioPublicacion(1945);
        System.out.println("- " + libro1.getTitulo() + "\n- " + libro1.getAutor() + "\n- " + libro1.getAnioPublicacion());

    }
}
