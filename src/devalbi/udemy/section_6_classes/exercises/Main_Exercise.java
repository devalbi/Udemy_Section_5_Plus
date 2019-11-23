package devalbi.udemy.section_6_classes.exercises;

public class Main_Exercise {

    public static void main(String[] args) {

/*        SimpleCalculator_1 calculator = new SimpleCalculator_1();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());*/ // Exercise 1 Simple Calculator

//Exercise 2 Person_2
/*        Person_2 Person_2 = new Person_2();
        Person_2.setFirstName("");   // firstName is set to empty string
        Person_2.setLastName("");    // lastName is set to empty string
        Person_2.setAge(10);
        System.out.println("fullName= " + Person_2.getFullName());
        System.out.println("teen= " + Person_2.isTeen());
        Person_2.setFirstName("John");    // firstName is set to John
        Person_2.setAge(18);
        System.out.println("fullName= " + Person_2.getFullName());
        System.out.println("teen= " + Person_2.isTeen());
        Person_2.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + Person_2.getFullName());*/

//Exercise 3 Point_3_3
        Point_3 first = new Point_3(6, 5);
        Point_3 second = new Point_3(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point_3 Point_3 = new Point_3();
        System.out.println("distance()= " + Point_3.distance());
    }
}
