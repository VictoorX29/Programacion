package testCalculadora;

public class Calculadora {
    int numero;
    
    void setNumero(int n){
        this.numero = n;
    }
    int getNumero(){
        return this.numero;
    }
    int factorial(){
        int cont = this.numero - 1;
        int numeroF = this.numero;
        while (cont>1){
            numeroF *= cont;
            cont--;
        }
        return numeroF;
    }
    void paresAnteriores(){
        int numeroP = this.numero;
        int res;
        while(numeroP>0){
            res = numeroP % 2;
            if(res==0){
                System.out.println("El " + numeroP + " es par.");
            }
            numeroP--;
        }
    }
    boolean isPrimo(){
        int numeroPr = this.numero,res,cont = 0;
        for (int i = 1; i <= numeroPr; i++) {
            res=numeroPr%i;
            if(res==0){
                cont++;
            }
        }
        return cont==2;
    }
}
