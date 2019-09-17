public class ControlFlowExercises {
    public static void main(String[] args){

//        1. Loop basics
//        a. While
//          Create an integer variable i with a value of 5.
//          Create a while loop that runs so long as i is less than or equal to 15
//          Each loop iteration, output the current value of i, then increment i by one.
//
        //        int i = 0;
        //        while (i <= 15){
        //            System.out.println("i is " + i);
        //            i++; //makes i go up plus one wihtout this it will run the value of i forever
        //        }

//        b. Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        //          int i = 2;
        //        do{
        //            System.out.println("Count to 100 in 2's " + i);
        //        }while(i++ <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.

        //        int i = 100; //since we are counting from 100 down i needed to change to 100
        //        do{
        //            System.out.println("take away 5 " + i);
        //            i -= 5; //decrements by five, HAVE to use the -= not just -
        //        }while(i >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on
//        each line while the number is less than 1,000,000. Output should equal:

        //        long i = 2;
        //        do{
        //           i *= i;
        //           System.out.println(i);
        //        }while(i <= 1000000);

//        c. For
//        Refactor the previous two exercises to use a for loop instead.

        //        Question 1 refactored
        //        for(int i = 1; i <= 15; i++){
        //            System.out.println(i);
        //        }

        //        Question 2 refactored
//                    for(int i = 2; i <= 100; i += 2){
//                        System.out.println(i);
//                    }
        //        Question 3 refactored
//                    for(int i = 100; i >= -10; i -= 5){
//                        System.out.println(i);
//                    }

//       2. Fizzbuzz

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0 && i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if((i % 5) == 0){
                System.out.println("Buzz");
            } else if((i % 3) == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}
