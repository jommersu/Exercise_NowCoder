/*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

 */

/*
分析：需要考虑到各种特殊的情况，exponent小于1，是负数等情况
以及输入base是0，exponent是0的情况，同时是0的情况
 */
public class Power {
    public static void main(String[] args){
        System.out.println("when 0, 1 the power is " + getPower(0,1) );
        System.out.println("when 0, 0 the power is " + getPower(0,0) );
        System.out.println("when 1, 0 the power is " + getPower(1,0) );
        System.out.println("when 2, -2 the power is " + getPower(2,-2) );
    }

    public static double getPower(double base, int exponent) {
        double result = 1;
        if(base == 0){
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        if (exponent < 0) {
            for (int i = 0; i < Math.abs(exponent); i++) {
                result *= base;
            }
            return 1.0 / result;
        }

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
