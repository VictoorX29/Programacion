package maxdivMinMult;

import java.util.*;

public class MaxdivMinmult {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        calculadora c1 = new calculadora();
        System.out.print("Introduce X : ");
        c1.setX(leer.nextInt());
        leer.nextLine();
        System.out.print("Introduce Y : ");
        c1.setY(leer.nextInt());
        System.out.println("El MCD de " + c1.x + " y " + c1.y + " es = " + c1.calcularMCD());
        System.out.println("El MCM de " + c1.x + " y " + c1.y + " es = " + c1.calcularMCM());
   }
}
