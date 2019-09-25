public class Person {
    private String name;


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + this.getName());
    }

    //        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

    //Both persons point to the same location
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


    //Again, same locations so changing one property affects both
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Kyndall");

//        System.out.println("Name " + person1.getName());

        System.out.println("Getting new name");
        person1.setName("Ollenna");

        person1.sayHello();
    }
}
