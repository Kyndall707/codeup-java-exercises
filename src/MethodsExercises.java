import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args){

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


    //BONUS FOR PODS

    //multiply without *
    public static int multiplyWithLoop(int num1, int num2){
        int output = 0;
        for(int i = 0; i < num2; i++){
            output += num1;
        }
        return output;
    }

    //get the fractoral of a number, hard :(
    public static long fractoral(int num){
        long output = 1;
        for(int i = 1; i <= num; i++){
            output *= i;
        }
        return output;
    }
}
