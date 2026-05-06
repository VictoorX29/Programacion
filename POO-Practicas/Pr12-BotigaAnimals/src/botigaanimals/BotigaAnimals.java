package botigaanimals;

import java.util.Scanner;

public class BotigaAnimals {

    public static void main(String[] args) {
        int gos, ocell, peix;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Cuantos perros quieres introducir (1-5): ");
            gos=leer.nextInt();
            leer.nextLine();
        } while (gos<1||gos>5);
        do {
            System.out.print("Cuantos pajaros quieres introducir (1-5): ");
            ocell=leer.nextInt();
            leer.nextLine();
        } while (ocell<1||ocell>5);
        do {
            System.out.print("Cuantos peces quieres introducir (1-5): ");
            peix=leer.nextInt();
            leer.nextLine();
        } while (peix<1||peix>5);
        Gos[] perros = new Gos[gos];
        Ocell[] pajaros = new Ocell[ocell];
        Peix[] peces = new Peix[peix];
        System.out.println("GOSSOS");
        for (int i = 0; i < perros.length; i++) {
            perros[i]=new Gos();
            System.out.println("\nGos " + i);
            System.out.print("Edad : ");
            perros[i].edat=leer.nextInt();
            leer.nextLine();
            System.out.print("Pes : ");
            perros[i].pes=leer.nextDouble();
            leer.nextLine();
            System.out.print("Raza : ");
            perros[i].raza=leer.nextLine();
        }
        System.out.println("\nOCELLS");
        for (int i = 0; i < pajaros.length; i++) {
            pajaros[i]=new Ocell();
            System.out.println("\nOcell " + i);
            System.out.print("Edad : ");
            pajaros[i].edat=leer.nextInt();
            leer.nextLine();
            System.out.print("Pes : ");
            pajaros[i].pes=leer.nextDouble();
            leer.nextLine();
            System.out.print("Especie : ");
            pajaros[i].especie=leer.nextLine();
        }
        System.out.println("\nPEIXOS");
        for (int i = 0; i < peces.length; i++) {
            peces[i]=new Peix();
            System.out.println("\nPeix " + i);
            System.out.print("Edad : ");
            peces[i].edat=leer.nextInt();
            leer.nextLine();
            System.out.println("Pes : ");
            peces[i].pes=leer.nextDouble();
            leer.nextLine();
            do {
                System.out.print("Aigua salada o dolza? : ");
                peces[i].aigua=leer.nextLine();
            } while (!peces[i].aigua.equals("salada")&&!peces[i].aigua.equals("dolza"));
            if(peces[i].aigua.equals("salada")){
                peces[i].salada=true;
            }else{
                peces[i].salada=false;
            }
        }
        System.out.println("Datos de animales:");
        System.out.println("Gossos");
        for (int i = 0; i < perros.length; i++) {
            System.out.println("Gos " + i);
            perros[i].mostrarGos();
        }
        System.out.println("\nOcells");
        for (int i = 0; i < pajaros.length; i++) {
            System.out.println("Ocell " + i);
            pajaros[i].mostrarOcell();
        }
        System.out.println("\nPeixos");
        for (int i = 0; i < peces.length; i++) {
            System.out.println("Peix " + i);
            peces[i].mostrarPeix();
            
        }
    }
}
