package superclasesysubclases;

public class Comida extends Producto {
    //Atributos de Comida
    int cadDia, cadMes, cadAnyo;
    //Constructores
    public Comida(){
        
    }
    public Comida(int d, int m, int a){
        this.cadDia=d;
        this.cadMes=m;
        this.cadAnyo=a;
    }
    public Comida(int ident, double pvp, String name, int d, int m, int a){
        super(ident, pvp, name);
        this.cadDia=d;
        this.cadMes=m;
        this.cadAnyo=a;
    }
    void muestra(){
        super.display();
        System.out.println("Caducidad es: " + this.cadDia + "-" + this.cadMes + "-" + this.cadAnyo);
    }
}