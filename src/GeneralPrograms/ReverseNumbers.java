package GeneralPrograms;

public class ReverseNumbers {

    public static void main(String[] args) {
        System.out.println("Reverse");
        System.out.println(ReverseNum(123456789));
    }
    static int ReverseNum( int num){

        int result = 0;
        while(num>0){
            int rem = num % 10;
            result = result*10 + rem;
            num /= 10;
        }
        return result;
    }
}



//for(int i = 0; num>0; ;){
//
//        int rem = num % 10;
//        result = result*10 + rem;
//        num /= 10;
//    if(num>0) ;
//        }

//while(num>0)
////12345 => 54321
//num % 10 = 5
//rem = 5
//result = 5
//
//12345/10 = 1234
//num = 1234
//
//num % 10 = 4
//rem = 4
//result = 5*10 +4

