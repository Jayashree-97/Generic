package ArrayConcepts;

public class MaximumTest<T extends Comparable<T>>{
    T x;
    T y;
    static T z;
    public MaximumTest(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        
        return MaximumTest.maximum(x, y, z);
    }
    //Largest values are determine and compare objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x; // Here x is assumed as large
        if(y.compareTo(max) > 0){
            max = y; // y is largest now
        }
        if(z.compareTo(max) > 0){
            max = z; // z is largest now
        }
        printMax(x, y, z, max);
        return max;
    }
    public static  String testMaximum(String x, String y, String Z){
        String max = x;
        if(y.compareTo(max) > 0){
            max =y;
        }
        if(z.compareTo(max) > 0){
            max = z; // z is largest now
        }
        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.println("Max of %s, %s and %s is %s\n",x, y, z, max);
    }
    public static void main(String[] args){
        Integer xInt = 3, yInt = 4, zInt  = 5;
        Float xF1 = 6.6f, yF1 = 8.8f,zF1 = 7.7f;
        String xstr = "pear", ystr ="apple", zStr = "orange";

        MaximumTest.testMaximum(xStr, yStr,zStr);
        new MaximumTest(xInt, yInt, zInt).maximum();
        new MaximumTest(xF1, yF1, zF1).maximum();
        new MaximumTest(xStr, yStr, zStr).maximum();

    }
}

