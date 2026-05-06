package palindromos;

public class CalcPal {
    int n;
    
    void setN(int n){
        this.n = n;
    }
    int getN(){
        return this.n;
    }
    boolean isPalindrom(){
        int p = this.n;
        int[] palindromo = new int[6];
        for (int i = 0; i < 6; i++) {
            palindromo[i] = p % 10;
            p /= 10;
        }
        for (int i = 0, n = 5; i < 6; i++, n--) {
            if(palindromo[i]!=palindromo[n]){
                return false;
            }
            System.out.println(palindromo[i] + " " + palindromo[n]);
        }
        return true;
    }
}
