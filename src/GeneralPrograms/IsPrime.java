package GeneralPrograms;

public class IsPrime {
    public static void main(String[] args) {
//        System.out.println(isPrime(89));
        System.out.println(isPrimeSqrt(11));
    }
    static boolean isPrime(int num) {
        int count = 0;
        for(int i=1;i<=num;i++){

            if(num % i == 0){
                count++;
            }

        }
//        if(count==2) return true;
//        return false;
        return count == 2;

    }

    static boolean isPrimeSqrt(int num){
        if(num == 1) return false;
        int upper = (int)Math.sqrt(num);
        for(int i=2;i<=upper;i++){
            if (num%i==0) {
                return false;
            }
        }
        return  true;
    }
}
