package botigaanimals;

public class Gos extends Animal {
    String raza;
    public Gos(){
        
    }
    public Gos(int edat, double pes, String raza){
        super(edat, pes);
        this.raza=raza;
    }
    void mostrarGos(){
        super.mostrar();
        System.out.println("Raza : " + this.raza);
    }
}
