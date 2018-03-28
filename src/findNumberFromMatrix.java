public class findNumberFromMatrix {
    public static void main(String[] args){
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(Find(5,array));
    }
    public static boolean Find(int target, int [][] array) {
        int row = 0;
        int line = array[0].length - 1;
        while ((row <= array.length-1) && line >= 0){
            if(target == array[row][line]){
                return true;
            }else if(target < array[row][line]){
                line--;
            }else if(target > array[row][line]){
                row++;
            }
        }
        return false;
    }

}