package bitllemoned;

public class Calculo {
    int numero;
    int b500;
    int b200;
    int b100;
    int b50;
    int b20;
    int b10;
    int b5;
    int m2;
    int m1;
    
    int bill500(){
        if(this.numero>500){
            this.b500 = this.numero / 500;
            this.numero %= 500;
        }else{
            this.b500=0;
        }
        return this.b500;
    }
    int bill200(){
        if(this.numero>200){
            this.b200 = this.numero / 200;
            this.numero %= 200;
        }else{
            this.b200=0;
        }
        return this.b200;
    }
    int bill100(){
        if(this.numero>100){
            this.b100 = this.numero / 100;
            this.numero %= 100;
        }else{
            this.b100=0;
        }
        return this.b100;
    }
    int bill50(){
        if(this.numero>50){
            this.b50 = this.numero / 50;
            this.numero %= 50;
        }else{
            this.b50=0;
        }
        return this.b50;
    }
    int bill20(){
        if(this.numero>20){
            this.b20 = this.numero / 20;
            this.numero %= 20;
        }else{
            this.b20=0;
        }
        return this.b20;
    }
    int bill10(){
        if(this.numero>10){
            this.b10 = this.numero / 10;
            this.numero %= 10;
        }else{
            this.b10=0;
        }
        return this.b10;
    }
    int bill5(){
        if(this.numero>5){
            this.b5 = this.numero / 5;
            this.numero %= 5;
        }else{
            this.b5=0;
        }
        return this.b5;
    }
    int mon2(){
        if(this.numero>2){
            this.m2 = this.numero / 2;
            this.numero %= 2;
        }else{
            this.m2=0;
        }
        return this.m2;
    }
    void setNumero(int n){
        this.numero = n;
    }
    int getNumero (){
        return this.numero;
    }
}
