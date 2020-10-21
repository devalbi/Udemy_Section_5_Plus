package devalbi.udemy.Section_5.work;

public class While {
    public static void main(String[] args){

        //issue is code might not be run if
        //value going into while loop is the same as condition
        int count = 0;
        while(count != 5){
            System.out.println("Count value is: " + count);
            count++;
        }

        count = 1;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }

        //do-while ensures statement is executed at least once
        //if value was greater than while statement, may be infinite loop.
        do{
            System.out.println("Count 2 value is: " + count);
            count++;

            //forces code to exit loop.
            if(count > 100){
                break;
            }
        } while(count != 6); //Semi-colon needed after do-while
    }
}
