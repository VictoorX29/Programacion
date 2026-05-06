package botigaanimals;

public class Peix extends Animal {
    Boolean salada;
    String aigua;
    public Peix(){
        
    }
    public Peix(int edat, double pes, Boolean salada){
        super(edat, pes);
        this.salada=salada;
    }
    void mostrarPeix(){
        super.mostrar();
        if(salada==true){
            System.out.println("Aigua salada");
        }else{
            System.out.println("Aigua dolza");
        }
    }
}
