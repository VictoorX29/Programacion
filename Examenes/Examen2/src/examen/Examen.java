package examen;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Jugador t1 = new Jugador();
        double premio;
        System.out.println("Bienvenido al torneo FPLlefia.");
        System.out.print("Introduce el nombre del torneo : ");
        t1.nombreTorneo=leer.nextLine();
        do {
            System.out.print("Introduce el dia (1-28) : ");
            t1.dia=leer.nextInt();
            leer.nextLine();
        } while (t1.dia<1||t1.dia>28);
        do {
            System.out.print("Introduce el mes (1-12) : ");
            t1.mes=leer.nextInt();
            leer.nextLine();
        } while (t1.mes<1||t1.mes>12);
        do {
            System.out.print("Introduce el anyo (2025-2030) : ");
            t1.anyo=leer.nextInt();
            leer.nextLine();
        } while (t1.anyo<2025||t1.anyo>2030);
        System.out.print("Introduce tu inscripcion : ");
        t1.inscripcion=leer.nextDouble();
        leer.nextLine();
        //t1.generarPuntuacionesRival();
        //t1.mostrarPuntuaciones(t1.puntuacionesRival);
        System.out.println("Introduce tus puntuaciones (0-100)");
        for (int i = 0; i < t1.puntuaciones.length; i++) {
            do {
                System.out.print("Puntuacion " + i + " : ");
                t1.puntuaciones[i]=leer.nextInt();
            } while (t1.puntuaciones[i]<0||t1.puntuaciones[i]>100);
        }
        t1.mostrarDatosTorneo();
        t1.mostrarPuntuaciones();
        t1.generarPuntuacionesRival();
        t1.mostrarPuntuaciones(t1.puntuacionesRival);
        premio=t1.calcularResultado();
        System.out.println("\nTu premio es : " + premio);
    }
}
