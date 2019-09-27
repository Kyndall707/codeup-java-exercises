import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args){
//        String[] adjectives = new String[10];
//        String[] nouns = new String[10];

        String adjective[] = {"Beautiful", "Hot", "Sparkling", "Antique", "Fragrant", "Rain", "Fresh", "Boxy", "Blue", "Bitter"};
        String nouns[] = {"Dimple", "Mob", "Salt Middle School", "Reigen", "Tsubomi", "Ritsu", "Teruki", "Sho", "Ryo", "Keiji"};

        Random random = new Random();

        int index2 = random.nextInt(nouns.length);
        int index = random.nextInt(adjective.length);
        System.out.println("Here is you Server name: \n" + adjective[index] + "-" + nouns[index2]);
    }
}
