package AH2;

public class solutions {


    public static boolean isPrime(int x){
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }  
        return true; 
    }


    public static void main(String [] args){
        System.out.println(solutions.isPrime(2));
        System.out.println(solutions.isPrime(0));
        System.out.println(solutions.isPrime(1));
        System.out.println(solutions.isPrime(31));
        
    }
}

