package academy.learnprogramming.recursion;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        System.out.println(iterativeFactorial(x ));
        System.out.println(recursiveFactorial(x));


        // 1! = 1 * 0! = 1;
        // 2! = 2 * 1 => 2 * 1!
        // 3! = 3 * 2 => 3 * 2!
        // 4! = 4 * 6 => 4 * 3!
        // n! = n * (n-1)!

    }

        public static int recursiveFactorial(int num){
        if(num==0){
            return 1;
        }
        else{

            return num * recursiveFactorial(num-1);

        }
        }


    //Doing Factorial in an interative Fashion.
        public static int iterativeFactorial(int num){
            if(num == 0) {
                return 1;
            }
            System.out.println("Starting Iterative:");
            int factorial = 1;
            for(int i = 1; i<=num; i++){
                factorial *= i;
                System.out.println(String.format("Current i = %d, Current factorial = %d",i,factorial));
            }
            return factorial;
        }

}
