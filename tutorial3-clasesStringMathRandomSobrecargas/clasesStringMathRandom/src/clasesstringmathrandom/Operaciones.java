package clasesstringmathrandom;

public class Operaciones {
    void mostrarVector(int[] vec){
        int i;
        for (i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }
    int[] cambiarVector(int[] vec){
        int[] vecDev = new int[20];
        for (int i = 0; i < vec.length; i++) {
            vecDev[i] = vec[i] * 10;
        }
        return vecDev;
    }
}