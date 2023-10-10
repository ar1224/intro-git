package AH2;

public class solutions {


    public static boolean isPrime(int x){
        for (int i = 2; i < x; i++){
            if (x % 1 == 0){
                return false;
            }
        }  
        return true; 
    }


    public static void main(String [] args){
        solutions.isPrime(2);
        solutions.isPrime(0);
        solutions.isPrime(1);
        solutions.isPrime(31);
        
    }
}

