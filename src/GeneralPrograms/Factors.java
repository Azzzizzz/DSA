package GeneralPrograms;

public class Factors {
    public static void main(String[] args) {
        System.out.println("factors");
//
//
//        System.out.println(countFactors(6));
        printFactors(16);
    }


    static int countFactors(int n) {
        int count = 0;
        int upper = (int) Math.sqrt(n);


        for (int i = 1; i <= upper; i++) {
            if (n % i == 0) {
                count = count + 2;
            }

        }
        return upper * upper == n ? count - 1 : count;
    }

    static int printFactors(int n) {
        int upper = (int) Math.sqrt(n);
        for (int i = 1; i <= upper; i++) {
            if (n % i == 0) {

                System.out.println(i);
//                if (upper * upper == n && i == upper) {
//                    break;
//                }
//                System.out.println(n / i);
                if (i != n / i) {
                    // Avoid printing the same factor twice for perfect squares
                    System.out.println(n / i);
                }
            }
        }

        
        return 0;
    }
}
