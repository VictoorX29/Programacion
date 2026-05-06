package sobrecarga;

public class Mensajes {
    void muestra(){
        System.out.println("No se ha mandado ni recibido nada.");
    }
    void muestra(String a){
        System.out.println("Se ha mandado : " + a);
    }
    int muestra(String a, String b){
        int res;
        res=a.length()+b.length();
        return res;
    }
    String muestra(int x, int y){
        int res;
        res=x+y;
        return(x + " + " + y + " = " + res); 
    }
}
