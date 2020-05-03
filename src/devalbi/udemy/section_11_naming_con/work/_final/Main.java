package devalbi.udemy.section_11_naming_con.work._final;

public class Main {

    public static void main(String[] args) {
      /*  SomeClass s1 = new SomeClass("One");
        SomeClass s2 = new SomeClass("Two");
        SomeClass s3 = new SomeClass("Three");

        System.out.println(s1.getInstanceNumber());
        System.out.println(s2.getInstanceNumber());
        System.out.println(s3.getInstanceNumber());

        System.out.println(Math.PI);//example of public static final constant value

        //Math's constructor is private,
        //prevents instances of it being created.
        //For class if all methods and variables are static.
        //Final in class declaration prevents class from being sub-classed.
        //Math math = new Math();

        //Example why to prevent a method being overridden
        //Absolutely not a example how to encrypt passwords.
        int pw = 1236887655;
        //Password password = new Password(pw);

        Password password = new ExtendedPassword(pw);
        //decrypts password,
        //shows why using final for StoredPassword in Password Class,
        //so it can't be overridden in extended class.

        password.storePassword();

        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(1236887655);
*/

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + test.owner);


    }
}
