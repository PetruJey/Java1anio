package POO.Kata4;

public class Granja {
    public static void main (String[] args){
        Gallina gallina1 = new Gallina(1, 2, 0);
        Gallina gallina2 = new Gallina(2, 4, 0);
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina2.envejecer();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
