package devalbi.udemy.work;

public class ParsingClass {
    public static void main(String[] args) {
        String numberAsString= "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        //int stringAsNumber = Integer.valueOf(numberAsString);
        //Converts String to Double
        double stringAsNumber2 = Double.parseDouble(numberAsString);

        //System.out.println("ValueOf: " + stringAsNumber + ", parseInt: " + stringAsNumber2);
        System.out.println("parseDouble: " + stringAsNumber2);

        //Will convert to int double, int, add to value and then convert back to String
        numberAsString+=1;
        stringAsNumber2+=1;

        //stringAsNumber+=1;

        //System.out.println("Org Number: "+ numberAsString + ", ValueOf: " + stringAsNumber + ", parseInt: " + stringAsNumber2);
        System.out.println("Org Number: "+ numberAsString + ", parseDouble " + stringAsNumber2);


    }
}
