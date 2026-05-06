package banc;

public class Banc {

    public static void main(String[] args) {
        Compte c1 = new Compte();
        c1.saldo=300.50f;
        c1.nomClient="Victor";
        c1.nomCompte="BBVA";
        System.out.println("La cuenta de " + c1.nomClient + " en " + c1.nomCompte + " tiene un saldo de : " + c1.saldo + " euros");
        System.out.println("\nSe ingresara 400 en la cuenta.");
        c1.ingresar(400);
        System.out.println("La cuenta ahora tiene un saldo de : " + c1.saldo + " euros");
        System.out.println("\nSe sacara 200 de la cuenta.");
        c1.sacar(200);
        System.out.println("La cuenta ahora tiene un saldo de : " + c1.saldo + " euros");
        System.out.println("\nSe invertira la mitad en bolsa.");
        c1.saldo+=c1.invertir(c1.saldo);
        System.out.println("El saldo despues de la inversion es : " + c1.saldo + " euros");
    }
}
