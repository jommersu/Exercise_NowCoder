/*
跳台阶变态版
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

/*
分析：
f(2) = f(1) + f(0)
...
f(n) = f(n-1) + f(n-2) + ... + f(0)

其中f(0)代表直接跳N阶台阶
但先判断target为0时，需要return0
 */
public class JumpFloor_extend {

    public static void main(String[] args){
        System.out.println(JumpFloor_extend(3));
    }
    public static int JumpFloor_extend(int target) {
        int[] result = new int[target + 1];
        result[0] = 1;
        result[1] = 1;

        if(target == 0){
            return 0;
        }else if (target == 1){
            return 1;
        }

        for(int i = 2; i <= target; i++){
            for(int j = 0; j < i; j++){
                result[i] += result[j];
            }
        }
        return result[target];
    }
}