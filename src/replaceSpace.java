/*
字符串
 */
/*
请实现一个函数，
将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class replaceSpace {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.print(replaceSpace(str));

    }
    public static String replaceSpace(StringBuffer str) {
        int spacecount = 0;
        int oldLength = str.length();
        StringBuffer tmp = new StringBuffer();

        for(int i = 0; i < oldLength; i++){

            if(str.charAt(i) == ' '){
                spacecount++;
                tmp.append("%20");
            }else {
                tmp.append(str.charAt(i));
            }
        }
        tmp.setLength(oldLength + spacecount * 2);
 /*       int index = 0;
        for(int j = 0; j < oldLength; j++){
            if(str.charAt(j) != ' '){
                str.setCharAt(index++, tmp.charAt(j));
            }else {
                str.setCharAt(index++, '%');
                str.setCharAt(index++, '2');
                str.setCharAt(index++, '0');
            }
        }
        */
        return tmp.toString();
    }
}