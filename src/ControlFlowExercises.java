import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

//        1. Loop basics
//        a. While
//          Create an integer variable i with a value of 5.
//          Create a while loop that runs so long as i is less than or equal to 15
//          Each loop iteration, output the current value of i, then increment i by one.
//
        //        int i = 5;
        //        while (i <= 15){
        //            i++; //makes i go up plus one wihtout this it will run the value of i forever
        //            System.out.println("i is " + i);
        //        }

//        b. Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//                  int i = 0;
//                do{
//                    System.out.println("Count to 100 in 2's " + i);
//                        i += 2;
//                }while(i <= 99);

//        Alter your loop to count backwards by 5's from 100 to -10.

        //        int i = 100; //since we are counting from 100 down i needed to change to 100
        //        do{
        //            System.out.println("take away 5 " + i);
        //            i -= 5; //decrements by five, HAVE to use the -= not just -
        //        }while(i >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on
//        each line while the number is less than 1,000,000. Output should equal:

                //        long i = 2; //if you use an int itll will overflow and break and just print a lot of 0's
                //        do{
                //          i = i * i;
                //           System.out.println(i);
                //        }while(i <= 1000000);

        //        c. For
        //        Refactor the previous two exercises to use a for loop instead.

                //        Question 1 refactored
                   //        for(int i = 1; i <= 15; i++){  //in the () is (start; finish; whats changing);
                    //            System.out.println(i);
                    //        }

                //        Question 2 refactored
        //                    for(int i = 2; i <= 100; i += 2){  //in the () is (start; finish; whats changing);
        //                        System.out.println(i);
        //                    }
                //        Question 3 refactored
        //                    for(int i = 100; i >= -10; i -= 5){  //in the () is (start; finish; whats changing);
        //                        System.out.println(i);
        //                    }

//       2. Fizzbuzz

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

            //        for(int i = 1; i <= 100; i++) {
            //            if ((i % 3 == 0 && i % 5 == 0)) {
            //                System.out.println("FizzBuzz");
            //            } else if ((i % 5) == 0) {
            //                System.out.println("Buzz");
            //            } else if ((i % 3) == 0) {
            //                System.out.println("Fizz");
            //            } else {
            //                System.out.println(i);
            //            }
            //        }


            //            as a switch statement
            //        for (int i = 1; i <= 100; i++){
            //            int res = i % 3;
            //            int res2 = i % 5;
            //            switch (res) {
            //                case 0:
            //            }
            //        }


//        3. Display a table of powers.

//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

                    //        Scanner input = new Scanner(System.in);

                    //        System.out.print("What number would you like to go up to?: ");
                    //        int number = Integer.parseInt(input.nextLine());

                    //        System.out.println("number | squared | cubed");
                    //        System.out.println("------ | ------- | -----");

                    //        for(int counter = 1; counter <= number; counter++){
                    //            System.out.println(String.format("%-6d | %-7d | %-5d", counter, (int) Math.pow(counter, 2), (int) Math.pow(counter, 3)));

                                    //putting (int) infront of mathpow itll change them into intergers not numbers
                                    //the -7 infront of the d in %-7d makes there be space
                    //        }

//        4. Convert given number grades into letter grades.

//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.


                //        Scanner input = new Scanner(System.in);

                //        System.out.println("Please enter your grade: ");

                //        int grade = Integer.parseInt(input.nextLine());

                //        String gradeLetter = "";

                //        if(grade <= 100 && grade >= 88){
                //            gradeLetter = "A";
                //        } else if (grade <= 87 && grade >= 80){
                //            gradeLetter = "B";
                //        } else if (grade <= 79 && grade >= 67){
                //            gradeLetter = "C";
                //        }else if (grade <= 66 && grade >= 60){
                //            gradeLetter = "D";
                //        }else if (grade <= 59 && grade >= 0){
                //            gradeLetter = "F";
                //        }
                //        System.out.println(gradeLetter);
    }
}
