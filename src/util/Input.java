package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    public Input(Scanner scanner){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please enter a word: ");
        return scanner.nextLine();
    }
}
