package chapter_5.manypraNums;

/**
 * @author HP
 * @date 2022/3/1
 */
public class max {
    public static void main(String[] args) {
        System.out.println(max(2.3,3,4,7.9,10));
    }

    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for(double a :values){
            if(a > largest){
                largest = a;
            }
        }
        return largest;
    }
}
