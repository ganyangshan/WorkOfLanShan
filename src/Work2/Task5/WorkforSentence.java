package Work2.Task5;


import java.util.*;

/**
 * - 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
 * - 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * - 返回所有不常用单词的列表。
 * - 您可以按任何顺序返回列表。
 * 把两个字符串以空格分开合并为一个字符串数组，题设就相当于返回就只出现的一次的字符串
 */
public class WorkforSentence {

    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> all = new ArrayList<>();
        s1=s1+" ";
        String t = s1 + s2;
        Boolean flag = true;
        String tal[] = t.split(" ");

        for (int i = 0; i < tal.length; i++) {
            flag = true;
            for (int j = i + 1; j < tal.length; j++) {
                if (tal[i].equals(tal[j])) {
                    flag = false;
                }
            }
            for (int j = 0; j < i; j++) {
                if (tal[i].equals(tal[j])) {
                    flag = false;
                }
            }
            if (flag) {
                all.add(tal[i]);
            }

        }
        System.out.println(all);
        String [] s = all.toArray(new String[0]);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入句1");
        String str1=sc.nextLine();
        System.out.println("请输入句2");
        String str2=sc.nextLine();
        WorkforSentence workforSentence = new WorkforSentence();
        System.out.println(workforSentence.uncommonFromSentences(str1,str2));
    }
}
