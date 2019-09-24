public class refactor {
    public static void fizzBuzzLoop() {
//        int i = 1;
//        while (true) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            if (i == 100) {
//                break;
//            }
//            i++;
//        }
            //        refactored
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 && i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
