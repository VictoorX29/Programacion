package calculadora;

public class Operaciones {
    double sumar(double x, double y){
        double z;
        z=x+y;
        return z;
    }
    double restar(double x, double y){
        double z;
        z=x-y;
        return z;
    }
    double mult(double x, double y){
        double z;
        z=x*y;
        return z;
    }
    double divis(double x, double y){
        double z;
        z=x/y;
        return z;
    }
    double fact(double x){
        for(double i = x-1;x<0;x++){
            x*=i;
        }
        return x;
    }
    double raizCuad(double x){
        double z;
        z=Math.sqrt(x);
        return z;
    }
    double raizEnes(double x, double r){
        double z;
        z=Math.pow(x, 1/r);
        return z;
    }
    double elevCuad(double x){
        double z;
        z=x*x;
        return z;
    }
}
