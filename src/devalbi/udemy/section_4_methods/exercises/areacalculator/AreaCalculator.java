package devalbi.udemy.section_4_methods.exercises.areacalculator;

public class AreaCalculator {

    public double area (double x) {
        if(x < 0) {
            return -1;
        }
        double ans =  Math.pow(x, 2) * Math.PI;
        System.out.println(ans);
        return ans;
    }

    public double area (double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }

        double ans = x * y;
        System.out.println(ans);
        return ans;
    }
}
