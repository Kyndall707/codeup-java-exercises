import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        //need Arrays.toString because without it itll just print the referance(??) code
//        Person personArray[];
//        personArray = new Person[3];

        Person[] personArray = new Person[3];

        personArray[0] = new Person("Poppy");
        personArray[1] = new Person("Petunia");
        personArray[2] = new Person("Chi-whi");


        for(Person person : personArray ){
            System.out.println(person.getName());
        }

        Person[] addPerson = Arrays.copyOf(personArray, personArray.length+1);
        addPerson[3] = new Person("Kyndall");

        for(Person person : addPerson){
            System.out.println(person.getName());
        }
        //exercise one done :')
    }
}
