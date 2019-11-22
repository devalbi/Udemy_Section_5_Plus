package devalbi.udemy.Section_5.work;

public class Switch {

    public static void main(String[] args)
    {
        ///Swtich and if-else are interchangeable, usually depends on Dev's style.

        int value = 3;
        if(value == 1){
            System.out.println("Value is 1");
        } else if (value == 2){
            System.out.println("Value is 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        //break ends switch statement and goes to next line after switch
        //default is same as else -  takes any scenario not covered
        //switch does not need break as ends anyway but good to put in
        //Can put in multiple cases for a single output like case3, 4, 5
        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually the value was : " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }


    }
}
