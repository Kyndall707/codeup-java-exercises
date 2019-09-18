import java.util.Scanner;
public class Bob {
    public static void main(String[] args){

//        2. Create a class named Bob with a main method for the following exercise.

//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

        Scanner input =  new Scanner(System.in);
        System.out.println("Say something to Bob: ");
        String whatsSaid = input.nextLine();
        String isOneLast = "!";
        String isTwoLast = "?";


        if(whatsSaid.endsWith(isOneLast)){
            System.out.println("Bob: Whoa, chill out!");
        }else if(whatsSaid.endsWith(isTwoLast)){
            System.out.println("Bob: Sure.");
        }else if(whatsSaid.isBlank()){
            System.out.println("Bob: Fine. Be that way!");
        } else{
            System.out.println("Bob: Whatever.");
        }
    }
}

