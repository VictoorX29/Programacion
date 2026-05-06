package maxdivMinMult;

public class calculadora {
    int x;
    int y;
    
    void setX (int n){
        this.x = n;
    }
    void setY (int n){
        this.y = n;
    }
    int getX (){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    int calcularMCD(){
        int cont;
        if(this.x>this.y){
            cont = this.y - 1;
        }else{
            cont = this.x - 1;
        }
        int resX = 0, resY = 0;
        boolean salir = true;
        while (salir == true){
            resX = this.x % cont;
            resY = this.y % cont;
            if(resX==0&&resY==0){
                return cont;
            }else{
                cont --;
            }
        }
        return 0;
    }
    int calcularMCM(){
        int cont=2,contc=2,resX=1,resY=0;
        boolean salir = true;
        while(salir == true){
            resX = this.x * cont;
            while(resY<resX){
                resY = this.y * contc;
                contc++;
            }
            if(resX==resY){
                return resX;
            }else{
                cont++;
            }
        }
        return 0;
    }
}
