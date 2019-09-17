public class HelloWorld {
    public static void main(String[] args){
//        1. Create an int variable named myFavoriteNumber and assign your
//        favorite number to it, then print it out to the console.
//        answer =
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

//        2. Create a String variable named myString and assign a string value to it,
        //then print the variable out to the console.
//        answer =
        String myString = "kyndall";
        System.out.println(myString);

        //"" is a string '' is a character

//        3. Change your code to assign a character value to myString.
//        What do you notice?
//            ANSWER = cannot assign a character to a string


//        4. Change your code to assign the value 3.14159 to myString.
//        What happens?
//        ANSWER = i got that it is an incompatible type specifically that it required a int and i put in a double

//       5. Declare an long variable named myNumber, but do not assign anything to it.
//        Next try to print out myNumber to the console. What happens?
//        ANSWER = gives me an error that myNumber may have not been initialized
//        long myNumber;
//        System.out.println(myNumber);

//        6. Change your code to assign the value 3.14 to myNumber.
//        What do you notice?
//            ANSWER = same thing with question 4. they are not compatible types. the long requires a long and 3.14 is a double unless you have the capital L or F(for float) at the end
//        long myNumber = 3.14;


//        7. Change your code to assign the value 123L
//        (Note the 'L' at the end) to myNumber.
//        ANSWER = gave me the print out of 123, no errors
//        float myNumber = 123L;
//        System.out.println(myNumber);

//        8. Change your code to assign the value 123 to myNumber.
//            ANSWER = Still gave me 123 in the console.
//        Why does assigning the value 3.14 to a variable declared as a long not compile,
//        but assigning an integer value does?
//            ANSWER = gave me a type incompatibility so idk

//        9. Change your code to declare myNumber as a float. Assign the value 3.14 to it.
//        What happens? What are two ways we could fix this?
//            ANSWER = again with the incompatable types, if i had to guess we could change it with a double and it would work, of just put F at the end of it apperantly works
//        float myNumber = 3.14F;
//        System.out.println(myNumber);

//        10. Copy and paste the following code blocks one at a time and execute them


        int x = 5;
        System.out.println(x++); //prints then increments
        System.out.println(x);

//        int x = 5;
//        System.out.println(++x); //increments 1st then prints
//        System.out.println(x);

//        What is the difference between the above code blocks? Explain why the code outputs what it does.
//            ANSWER = 1st one prints out 5 first then out 6
//                     2nd one prints out 6 and then the updated x which is 6
//                     i dont know the reason but if i hade to make a educated guess it would have to be that the
//                    1st one is printing the x first then adding while the 2nd one is adding first

//        11. Try to create a variable named class. What happens?
//              ANSWER = i think it expects it to be a METHOD AKA FUNCTION therefor cannot be a var
//        class mything = "hola";

//        12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?


        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
//        Copy and paste the code above and then run it.
//        Does the result match with your expectation?

//                How is the above example different from the code block below?


//        int three = (int) "three";
//        What are the two different types of errors we are observing?

//        Rewrite the following expressions using the relevant
//        shorthand assignment operators:


//        int x = 4;
//        x = x + 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.



    }
//        psvm tap to do public static void main quicker
}
//system out println is the same as console.log