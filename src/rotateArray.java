/*
旋转数组的最小数字
 */
/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
思路：旋转数组中有个特点，按照二分法，如果进行了旋转，那么其临界点的大小和左边界、右边界的大小有特殊的关系
 */

public class rotateArray {
    public static void main(String[] args){
        int[] array = {3,4,5,1,2};

        System.out.println(getMin(array));
    }
    public static int getMin(int [] array) {
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while(left < right){
            //not rotate

            if(array[left] < array[right]){
                return array[0];
            }

            if(left == right - 1){
                return array[left] <= array[right] ? array[left] : array[right];
            }
            mid = (left + right) / 2;

            if(array[left] > array[mid]){
                right = mid;
                continue;
            }

            if(array[mid] > array[right]){
                left = mid;
                continue;
            }

            if(array[left] == array[mid] && array[mid] == array[right]){
                int min = 0;
                for(int i = 0; i < array.length; i++){
                    min = array[i] <= min ? array[i] : min;
                }
                return min;
            }

        }
        return Math.min(array[left],array[right]);
    }
}