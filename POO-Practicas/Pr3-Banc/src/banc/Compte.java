package banc;

public class Compte {
    String nomClient;
    String nomCompte;
    float saldo;
    
    float ingresar(int dinero){
        this.saldo += dinero;
        return this.saldo;
    }
    float sacar(int dinero){
        this.saldo -= dinero;
        return this.saldo;
    }
    float invertir (float saldo){
        saldo /= 2;
        saldo *= 0.10;
        return saldo;
    }
}
