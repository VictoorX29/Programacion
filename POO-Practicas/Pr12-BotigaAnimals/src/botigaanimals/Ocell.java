package botigaanimals;

public class Ocell extends Animal{
    String especie;
    public Ocell(){
        
    }
    public Ocell(int edat, double pes, String especie){
        super(edat,pes);
        this.especie=especie;
    }
    void mostrarOcell(){
        super.mostrar();
        System.out.println("Especie : " + this.especie);
    }
}
