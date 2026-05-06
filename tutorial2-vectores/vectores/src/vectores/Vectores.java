package vectores;

public class Vectores {

    public static void main(String[] args) {
        // Vector de integers
        int[] numeros = new int[3];
        numeros[0]=9;
        numeros[1]=8;
        numeros[2]=7;
        int[] impares = new int[]{1,3,5};
        
        int[] pares = {2,4,6};
        
        System.out.println(numeros[0] + " " + impares[1] + " " + pares[2]);
        
        // Vector de doubles
        double[] notas = new double[]{5.5,6.5,8.5};
        
        System.out.println("La media es : " + (notas[0]+notas[1]+notas[2])/3);
        
        // Vector de caracteres
        char[] letras = new char[]{'a','b','c'};
        System.out.println("La segunda letra es : " + letras[1]);
        
        // Vector de string
        String[] palabras = new String[]{"Hola","a","todos"};
        int i;
        for (i = 0;i<palabras.length;i++){
            System.out.print(palabras[i] + " ");
        }
        
        // Matriz multidimensional
        int[][] matriz = new int[2][3];// 2 filas 3 columnas
        
        int[][] matriz2 = new int[][]{{0,1,2},{3,4,5}};
        /* Matriz 2:
        0   1   2
        3   4   5
        */
        int[][] matriz3 = {{9,8,7},{6,5,4}};
        System.out.println("\n\nLa cantidad de filas es : " + matriz.length);
        System.out.println("La cantidad de columnas es : " + matriz[0].length);
        int j;
        for(i=0;i<matriz3.length;i++){
            for(j=0;j<matriz3[i].length;j++){
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println("");
        }
        
        // Vector de 3 objetos de la clase Libro
        Libro[] biblioteca = new Libro[3];
        biblioteca[0] = new Libro();
        biblioteca[0].autor = "Shakeespeare";
        biblioteca[0].titulo = "Hamlet";
        biblioteca[0].paginas = 123;
        System.out.println("\n" + biblioteca[0].obtenerInfo());
    }
}
