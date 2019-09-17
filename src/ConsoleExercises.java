import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//       1. Copy this code
//        double pi = 3.14159;
//        write some code to have the out put like this: The value of pi is approximately 3.14.
//        System.out.format("The value of pi is approximately %.2f", pi);


        //EXPLORE SCANNER CLASS
        //1.
//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int userInputNumber = scanner.nextInt();

//        System.out.println("You entered: --> \"" + userInputNumber + "\" <--");
//        if anything but a integer is inputted an error will occur

        //2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        //
        //What happens if you enter less than 3 words? = it will wait until you enter three words.
        //What happens if you enter more than 3 words? = it will max out and run the code at three words.

//        Scanner input = new Scanner(System.in);

//        System.out.print("Enter three words: ");

//        String wordOne = input.next();
//        String wordTwo = input.next();
//        String wordThree = input.next();

//        System.out.println("you entered: \n" + wordOne + "\n" + wordTwo + "\n" + wordThree);
//        or
//        System.out.format("you entered: %s%n, %s%n, %s%n", wordOne, wordTwo, wordThree);

//       3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        do you capture all of the words? = no it only catches the first word of the sentence. Because .NEXT only catches one string not the entire one

//        Scanner inputTwo = new Scanner(System.in);

//        System.out.print("Enter a sentence: ");
//        String userInput = inputTwo.next();

//        System.out.println("You entered: " + userInput);


//      4.  Rewrite the above example using the nextLine method.
            //the .NEXTLINE method(?) works for sentences and is better overall when using a prompt

//        Scanner inputThree = new Scanner(System.in);

//        System.out.print("Enter a sentence: ");
//        String userInput = inputThree.nextLine();

//        System.out.println("You entered: " + userInput);


//        --------------Calculate the perimeter and area of Codeup's classrooms.-----------------

//        1. Prompt the user to enter values of length and width of a classroom at Codeup.
//        Use the nextLine method to get user input and cast the resulting string to a numeric type.

//                Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter classroom width: \n");
        System.out.print("Enter classroom length: \n");
        System.out.print("Enter classroom Volume: ");

        //could have done this instead of having 2 seprate vars for the same thing
//        int lenght = Integer.parseInt(input.nextLine());
        //Same for width and height

        String width = input.nextLine();
        String length = input.nextLine();
        //bonus
        String height = input.nextLine();

        //changes the strings to numbers
        int resultone = Integer.parseInt(width);
        int resulttwo = Integer.parseInt(length);
        int resultthree = Integer.parseInt(height);
        //easy way to get the perimeter area and volume
        int perimeter = (2*resultone) + (2*resulttwo);
        int area = resultone * resulttwo;
        int volume = resulttwo * resultone * resultthree;

//      2.  Display the area and perimeter of that classroom.

        System.out.println("The classrooms Area is: " + area + "\n The Perimeter of the classroom is: " + perimeter + "\n The Volume of the classroom is: " + volume);

    }
}
