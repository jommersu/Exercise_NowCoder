/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

/*
分析：斐波那契数列的变种
对于一个台阶，每次有1种跳法
对于两个台阶，每次有2种跳法
当台阶数大于2时，则有每次除去第一次只跳一级，剩下的为f(n-1)
和除去第一次跳两级，剩下的为f(n-2)
 */

public class JumpFloor {
    public static void main(String[] args){
        System.out.println("when target is " + 3 +
        "\nthe count is " + JumpFloor(3));
    }

    public static long JumpFloor(int target) {
        long one = 1;
        long two = 2;
        long count = 0;

        if (target <= 1) {
            return one;
        }else if (target == 2) {
            return two;
        }

        for (long i = 3; i <= target; i++) {
            count = one + two;
            one = two;
            two = count;
        }

        return count;
    }
}