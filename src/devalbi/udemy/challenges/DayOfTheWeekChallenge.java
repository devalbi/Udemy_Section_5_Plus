package devalbi.udemy.challenges;

public class DayOfTheWeekChallenge {

    public static void main(String[] args) {
        printDayOfTheWeek(3);
        printDayOfTheWeek(10);
        printDayOfTheWeekBonus(2);
        printDayOfTheWeekBonus(10);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.printf("Invalid Day");
                break;
        }

    }

    public static void printDayOfTheWeekBonus(int bonusDay)
    {
        if(bonusDay == 0){
            System.out.printf("Sunday");
        } else if (bonusDay == 1){
            System.out.println("Monday");
        }else if (bonusDay == 2){
            System.out.println("Tuesday");
        }else if (bonusDay == 3){
            System.out.println("Wednesday");
        }else if (bonusDay == 4){
            System.out.println("Thursday");
        }else if (bonusDay == 5){
            System.out.println("Friday");
        }else if (bonusDay == 6){
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid Day");
        }

    }
}
