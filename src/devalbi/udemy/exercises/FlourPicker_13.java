package devalbi.udemy.exercises;

public class FlourPicker_13 {

    public static void main(String[] args) {

//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 0, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 11));
//        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(6, 2, 17));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        int bigCountValue = bigCount * 5;

        if ((bigCountValue + smallCount) == goal) { return true;
        } else if(smallCount >= goal){ return true;
        } else if ((bigCountValue + smallCount) > goal) {
            for(int i = 0; i <= bigCount; i++) {
                int i5 = i* 5;
                if(i5== goal){
                    System.out.println("BigCount: " + i + " small count: 0m, Goal: " + goal);
                    return true;
                }
                for (int x = 0; x <= smallCount; x++) {
                    int xValue = i5 + x;
                    if (xValue == goal) {
                        System.out.println("BigCount: " + bigCount + ", smallCount: " + smallCount + ", Goal: " + goal);
                        return true;
                    }
                }
            }
        } return false;
        }
    }
