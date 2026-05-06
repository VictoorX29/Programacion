package sobrecarga;

public class Sobrecarga {

    public static void main(String[] args) {
        Mensajes m = new Mensajes();
        m.muestra();
        int cantidad=m.muestra("Hola", "Gente");
        System.out.println("La cantidad de caracteres en 'Hola' + 'Gente' es : " + cantidad);
        System.out.println(m.muestra(5, 4));
    }
}
