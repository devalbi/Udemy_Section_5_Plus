package devalbi.udemy.exercises;

public class FlourPicker_13 {

    public static void main(String[] args) {

        System.out.println((0 % 10));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        bigCount = bigCount * 5;

        if ((bigCount + smallCount) >= goal) {
            int remainder = goal % bigCount;
            if (smallCount == remainder) {
                System.out.println("BigCount: " + bigCount + ", smallCount: " + smallCount + ", Goal: " + goal);
                return true;
            } else return false;

        }
        return false;
    }
}
