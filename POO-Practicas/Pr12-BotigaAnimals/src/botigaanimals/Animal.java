package botigaanimals;

public class Animal {
    int edat;
    double pes;
    public Animal(){
        
    }
    public Animal(int edat, double pes){
        this.edat=edat;
        this.pes=pes;
    }
    void mostrar(){
        System.out.println("Edat : " + this.edat);
        System.out.println("Pes : " + this.pes);
    }
}
