package llistaalumnes;

import java.util.Scanner;

public class LlistaAlumnes {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        VectorAlumnes lista = new VectorAlumnes();
        String sigo = "no";
        System.out.println("Bienvenido a tu lista de alumnos.");
        do {
            lista.anadir();
            do {
                System.out.print("Quieres anadir otro alumno? (Si/No) : ");
                sigo=leer.nextLine().toLowerCase();
            } while (!sigo.equals("si")&&!sigo.equals("no"));
        } while (sigo.equals("si"));
        lista.mostrar();
    }
}
