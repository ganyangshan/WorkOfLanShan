package Task4;

import java.util.Arrays;

/**
 * 将**以下字符串**以英文逗号拆分，实现一个**至少含有以下方法中前三个方法**的字符串工具类，对分割后的字符串一一判断，
 * 并打印判断结果。
 *
 * 字符串： `acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi`
 *
 * * 方法一：判断字符串是否全是数字
 * * 方法二：判断字符串是否是大写字母
 * * 方法三：判断字符串是否全是小写字母
 * * 方法四：如果字符串全是字母，将其中所有小写字母转换为大写字母。
 * * 方法五：如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组
 * * 方法六：如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组。
 */
public class demoStringUtils {
    //字符串工具类中定义多种操作字符串的方法
    public boolean JudgeNum(String str){
        //查得java自带的方法
        for (int i = 0; i < str.length(); i++) {
            //循环一次则判断一次，若其中的字符串中的某个元素不是数字则返回false
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean JudgeLetter(String str){
        for (int i = 0; i < str.length(); i++) {
            //循环一次则判断一次，若其中的字符串中的某个元素不是数字则返回false
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //判断字符串是否为大写字母
    public boolean Jadgeupperchar(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //判断字符串是否为小写字母
    public boolean Jadgelowerchar(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLowerCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //如果字符串全是字母，将其中所有小写字母转换为大写字母。
    public String UpperLetters(String str){
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if(Character.isLowerCase(s[i])){
                s[i] = Character.toUpperCase(s[i]);
            }
        }
        return Arrays.toString(s);
    }
//    如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组
    public void ShowOrderDig(String str){
        if(JudgeNum(str)){
            char[] s = str.toCharArray();
            int [] nums = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                nums[i] = s[i]-'0';
            }
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
        }
    }
//    如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组。
    public void showSortedLetters(String str){
        char temp;
        char[] chs = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length(); j++) {
                if ((int)chs[j]<(int)chs[i]){
                    temp = chs[i];
                    chs[i]=chs[j];
                    chs[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(chs));
    }

}
