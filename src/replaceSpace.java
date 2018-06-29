/*
字符串	替换空格
 */
/*
请实现一个函数，
将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

利用Java语言的特性，StringBuffer的方法：append
 */

public class replaceSpace {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.print(replaceSpace(str));

    }
    public static String replaceSpace(StringBuffer str) {
        StringBuffer tmp = new StringBuffer();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                tmp.append("%20");
            }else {
                tmp.append(str.charAt(i));
            }
        }
        return tmp.toString();
    }
}