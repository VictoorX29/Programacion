package examen1;

public class Numero {
    int num;
    
    int getNum(){
        return this.num;
    }
    void setNum(int n){
        this.num = n;
    }
    boolean binario(){
        int bin = this.num;
        int[] vbin = new int[8];
        int i;
        for (i = 0; bin > 0; i++) {
            vbin[i] = bin % 2;
            bin /= 2;
        }
        int cont = 0;
        for (int j = i-1; j >= 0; j--) {
            System.out.println("En la posicion " + j + " esta el numero " + vbin[j]);
            if(vbin[j]==1){
                cont++;
            }
        }
        int res=cont%2;
        if(res==0){
            return true;
        }else{
            return false;
        }
    }
}
