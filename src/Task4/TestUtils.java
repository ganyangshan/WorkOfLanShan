package Task4;

/**
 * * 方法一：判断字符串是否全是数字
 * * 方法二：判断字符串是否是大写字母
 * * 方法三：判断字符串是否全是小写字母
 * * 方法四：如果字符串全是字母，将其中所有小写字母转换为大写字母。
 * * 方法五：如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组
 * * 方法六：如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组。
 */
public class TestUtils {
    public static void main(String[] args) {
        String str = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String arr[] = str.split(",");
        demoStringUtils utils = new demoStringUtils();
        for (int i = 0; i < 7; i++) {
            System.out.println("第"+(i+1)+"个是否全为数字判断结果："+utils.JudgeNum(arr[i]));
        }
        System.out.println("**************************************************");
        for (int i = 0; i < 7; i++) {
            System.out.println("第"+(i+1)+"个是否全为大写字母判断结果："+utils.Jadgeupperchar(arr[i]));
        }
        System.out.println("**************************************************");
        for (int i = 0; i < 7; i++) {
            System.out.println("第"+(i+1)+"个是否全为小写字母判断结果："+utils.Jadgelowerchar(arr[i]));
        }
        System.out.println("**************************************************");
        for (int i = 0; i < 7; i++) {
            if(utils.JudgeLetter(arr[i])){
                System.out.println(utils.UpperLetters(arr[i]));
            }
        }
        System.out.println("****************************************************");
        for (int i = 0; i < 7; i++) {
            if(utils.JudgeNum(arr[i])){
                utils.ShowOrderDig(arr[i]);
            }
        }
        System.out.println("****************************************************");
        for (int i = 0; i < 7; i++) {
            if(utils.JudgeLetter(arr[i])){
                utils.showSortedLetters(arr[i]);
            }
        }
    }
}
