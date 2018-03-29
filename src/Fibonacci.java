/*
斐波那契数列，输入n，输出斐波那契数列的第n项
 */
public class Fibonacci{
    //public static int[] save = null;
    public static void  main(String[] args){
        System.out.println(Fibonacci(5));
    }
/*
递归会占用大量的内存，因为每次递归的结果没有保存，造成大量的重复计算
 */
    /*    public static int Fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        if(save == null){
            save = new int[n+1];
        }
        if(save[n-2] != 0 && save[n-1] != 0){
            save[n] = save[n-2] + save[n-1];
            return save[n];
        }else{
            return Fibonacci(n-2)+Fibonacci(n-1);
        }

    }
*/
    /*
    动态规划，增加了空间复杂度
     */
    public static int Fibonacci(int n){
        /*初始化，one为n-2项，two为n-1项
          在数列中排序为： one two result
        */
        int one = 0;
        int two = 1;
        int result = 0;

        if (n <= 0) {
            return one;
        }else if (n == 1) {
            return two;
        }
        //从2开始，利用前两项相加
        for (int i = 2; i <= n; i++) {
            result = one + two;
            one = two;
            two = result;
        }

        return result;
    }
}
