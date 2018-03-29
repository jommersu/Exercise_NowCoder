/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
其实依旧是斐波那契数列，横着代表1，竖着代表2
 */
public class recoverSquare {

    public static void main(String[] args){
        System.out.println(recover(5));
    }

    public static int recover(int target) {
        int count = 0;
        int row = 1;
        int line = 2;

        if (target == 0) {
            return 0;
        }else if (target == 1){
            return row;
        }else if (target == 2) {
            return line;
        }

        for (int i = 3; i <= target; i++) {
            count = row + line;
            row = line;
            line = count;
        }

        return count;
    }

}
