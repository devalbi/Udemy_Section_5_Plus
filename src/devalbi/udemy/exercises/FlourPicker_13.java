package devalbi.udemy.exercises;

public class FlourPicker_13 {

    public static void main(String[] args) {
        canPack(1, 0, 4);
    }

    public static boolean canPack(int bigCount, int SmallCount, int goal){
        if((bigCount < 0) || (SmallCount < 0) || (goal < 0)){
            return false;
        }
        bigCount = bigCount * 5;

        if((bigCount + SmallCount) < goal)

    }
}
