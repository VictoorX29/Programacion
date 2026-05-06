package bitllemoned;

import java.util.Scanner;

public class BitlleMoned {

    public static void main(String[] args) {
        Calculo c1 = new Calculo();
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        c1.setNumero(lector.nextInt());
        System.out.println(c1.bill500() + " billetes de 500.");
        System.out.println(c1.bill200() + " billetes de 200.");
        System.out.println(c1.bill100() + " billetes de 100.");
        System.out.println(c1.bill50() + " billetes de 50.");
        System.out.println(c1.bill20() + " billetes de 20.");
        System.out.println(c1.bill10() + " billetes de 10.");
        System.out.println(c1.bill5() + " billetes de 5.");
        System.out.println(c1.mon2() + " monedas de 2.");
        System.out.println(c1.numero + " monedas de 1.");
    }
}
