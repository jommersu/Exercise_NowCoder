/*
调整数组顺序使奇数位于偶数前面
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

/*
分析：要保持相对位置不变，用插入排序的思想，只是修改插排的判断条件
 */
public class reOrderArray {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        reOrderArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reOrderArray(int [] array) {

        if (array == null || array.length == 1) {
            return;
        }

        for(int i = 1; i < array.length; i++){
            for (int j = i - 1; j>= 0; j--) {
                if ((array[j + 1] % 2 != 0) && array[j] % 2 == 0) {
                    swap(j, j+1 ,array);
                }
            }
        }

    }

    public static void swap(int i, int j, int [] array){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}