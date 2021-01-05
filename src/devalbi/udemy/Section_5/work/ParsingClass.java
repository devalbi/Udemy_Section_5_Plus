package devalbi.udemy.Section_5.work;

public class ParsingClass {
    public static void main(String[] args) {
        String numberAsString= "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        //int stringAsNumber = Integer.valueOf(numberAsString);
        //Converts String to Double
        double number = Double.parseDouble(numberAsString);

        //System.out.println("ValueOf: " + stringAsNumber + ", parseInt: " + number);
        System.out.println("parseDouble: " + number);

        //Will convert to double, int, add to value and then convert back to String
        numberAsString+=1;
        number+=1;

        //stringAsNumber+=1;

        //System.out.println("Org Number: "+ numberAsString + ", ValueOf: " + stringAsNumber + ", parseInt: " + number);
        System.out.println("Org Number: "+ numberAsString + ", parseDouble " + number);


    }
}
