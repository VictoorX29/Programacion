package posiciopuntxy;

public class PuntXY {
    int coordX=1;
    int coordY=2;
    
    String mostrar(){
        String mensaje;
        mensaje = "Coordenada X = " + this.coordX + "\nCoordenada Y = " + this.coordY;
        return mensaje;
    }
    String cambiar(int x, int y){
        String mensaje;
        this.coordX=x;
        this.coordY=y;
        mensaje = "\nLas nuevas coordenadas son : \nCoordenada X = " + this.coordX + "\nCoordenada Y = " + this.coordY;
        return mensaje;
    }
}
