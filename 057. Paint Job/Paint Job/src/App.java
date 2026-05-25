import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getBucketCount(2.5,4.2,1.0,2));
        System.out.println(getBucketCount(2.5,2.5,1.5));        
        System.out.println(getBucketCount(10, 1));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        double area = height*width;
        return (int)(Math.ceil((area/areaPerBucket)-extraBuckets));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0){
            return -1;
        }
        double area = height*width;
        return (int)(Math.ceil(area/areaPerBucket));
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        
        return (int)(Math.ceil(area/areaPerBucket));
    }
}
