/*
输入一个整数，输出该数二进制表示中1的个数。
其中负数用补码表示。
 */

/*
分析：位运算效率比较高
两种思路：
1、每次n无符号右移一位，和1做“与”运算，统计为1的结果
2、当n = n & (n - 1)时，相当于最右边的1每次变为0，每一次都会少一位，进行统计

 */
public class NumberOf1 {
    public static void main(String[] args){
        System.out.println(NumberOf1_one(15));
        System.out.println(NumberOf1_two(15));
    }

    /*方法1，每一位都需要遍历*/
    public static int NumberOf1_one(int n){
        int count = 0;
        while (n !=0){
            if((n & 1) != 0){
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    /*方法2：只需要遍历含有1的位数*/
    public static int NumberOf1_two(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }
}
