package devalbi.udemy.Section_5.exercises;

public class PaintJon_17 {

    public static void main(String[] args) {
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(7.25, 4.3, 2.35);
        getBucketCount(3.4, 1.5);
        getBucketCount(6.26, 2.2);
        getBucketCount(3.26, 0.75);

    }

    public static int getBucketCount(double height, double width, double areaPerBucket, int extraBuckets)
    {
        if(height <= 0 || width <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double areaToBePainted = height * width;

        //Math.ceil() always rounds up
        int bucketsNeeded = ((int) Math.ceil((areaToBePainted - (areaPerBucket * extraBuckets))/areaPerBucket));
        System.out.println("Buckets needed are: " + bucketsNeeded);
        return bucketsNeeded;
    }

    public static int getBucketCount(double height, double width, double areaPerBucket)
    {
        if(height <= 0 || width <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double areaToBePainted = height * width;

        //Math.ceil() always rounds up
        int bucketsNeeded = (int) Math.ceil(areaToBePainted/areaPerBucket);
        System.out.println("Buckets needed are: " + bucketsNeeded);
        return bucketsNeeded;
    }

    public static int getBucketCount(double areaOfWall, double areaPerBucket)
    {
        if(areaOfWall <= 0 || areaPerBucket <= 0){
            return -1;
        }
        //Math.ceil() always rounds up
        int bucketsNeeded = (int) Math.ceil(areaOfWall/areaPerBucket);
        System.out.println("Buckets needed are: " + bucketsNeeded);
        return bucketsNeeded;
    }


}
