package clasesstringmathrandom;

import java.util.Random;

public class ClasesStringMathRandom {
    public static void main(String[] args) {
        // Clase String
        /*
        System.out.println("CLASE STRING");
        String c = "Clase de DAW";
        System.out.println("Cadena original : " + c);
        System.out.println("Longitud de la cadena : " + c.length());
        System.out.println("Fragmento 5 al 9 : " + c.substring(5, 9));
        System.out.println("Posicion de la A : " + c.indexOf('a'));
        System.out.println("Esta contenida la palabra 'DAW' ? : " + c.contains("DAW"));
        System.out.println("La cadena es igual a 'clase de DAW'? : " + c.equals("Clase de DAW"));
        System.out.println("La cadena es igual a 'clase de ARI'? : " + c.equals("Clase de ARI"));
        System.out.println("Sustituir 'e' por 'i' : " + c.replace('e', 'i'));
        System.out.println("A mayusculas : " + c.toUpperCase());
        System.out.println("A minusculas : " + c.toLowerCase());
        */
        // Clase Math
        /*
        System.out.println("CLASE MATH");
        double n = 5.3;
        System.out.println("Redondeo hacia arriba : " + Math.ceil(n));
        System.out.println("Redondeo hacia abajo : " + Math.floor(n));
        System.out.println("Redondeo normal : " + Math.round(n));
        System.out.println("Potencia 3 elevado a 2 : " + Math.pow(3, 2));
        System.out.println("Raiz de 27 : " + Math.sqrt(27));
        System.out.println("Aleatorio entre 0 y 1 : " + Math.random());
        System.out.println("Aleatorio entre 0 y 100 : " + Math.random()*100);
        System.out.println("Aleatorio entre 0 y 100 integer : " + Math.round(Math.random()*100));
        */
        // Clase Random
        /*
        System.out.println("CLASE RANDOM");
        Random r = new Random();
        int num;
        int[] v = new int[20];
        
        num=r.nextInt(11); // Numeros del 0 al 10 (Ambos incluidos)
        System.out.println("El numero generado es : " + num);
        System.out.println("Los 20 nums generados son : ");
        for (int i = 0; i < v.length; i++) {
            v[i]=r.nextInt(11);
        }
        Operaciones op = new Operaciones();
        op.mostrarVector(v);
        System.out.println("\n\nLos 20 nums generados x10 son : ");
        int[] v2 = new int[20];
        v2=op.cambiarVector(v);
        op.mostrarVector(v2);
        */
    }
}