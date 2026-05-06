package testCalculadora;

import java.util.*;

public class TestCalculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calculadora n1 = new Calculadora();
        System.out.print("Introduce un numero : ");
        n1.setNumero(leer.nextInt());
        System.out.println("El factorial de " + n1.numero + " es : " + n1.factorial());
        n1.paresAnteriores();
        if(n1.isPrimo()==true){
            System.out.println(n1.numero + " es un numero primo.");
        }else{
            System.out.println(n1.numero + " no es un numero primo.");
        }
    }
}
