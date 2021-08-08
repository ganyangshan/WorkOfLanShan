package Work3.Task3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 在网上找到相关方法，自己类比写出
 * 思路与算法
 *
 * 我们也可以借助队列找到第一个不重复的字符。队列具有「先进先出」的性质，因此很适合用来找出第一个满足某个条件的元素。
 *
 * 具体地，我们使用与方法二相同的哈希映射，并且使用一个额外的队列，按照顺序存储每一个字符以及它们第一次出现的位置。
 * 当我们对字符串进行遍历时，设当前遍历到的字符为 ccc，如果 ccc 不在哈希映射中，我们就将 ccc 与它的索引作为一个二元组放入队尾，
 * 否则我们就需要检查队列中的元素是否都满足「只出现一次」的要求，即我们不断地根据哈希映射中存储的值（是否为 −1-1−1）选择弹出队首的元素
 * ，直到队首元素「真的」只出现了一次或者队列为空。
 *
 * 在遍历完成后，如果队列为空，说明没有不重复的字符，返回空格，否则队首的元素即为第一个不重复的字符以及其索引的二元组。
 *
 */
class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        Queue<me> queue = new LinkedList<me>();//定义一个队列me型
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (!hash.containsKey(ch)) {//如果不包含
                hash.put(ch, i);
                queue.offer(new me(ch, i));
                //　　offer   添加一个元素并返回true    如果队列已满，则返回false
            } else {
                hash.put(ch, -1);
                while (!queue.isEmpty() && hash.get(queue.peek().ch) == -1) {//poll弹出的是me对象，故要选中ch
                    queue.poll();//弹出直到遇到ch对应的num不为-1
                }
            }
        }
        return queue.isEmpty() ? ' ' : queue.poll().ch;
    }

    class me{//新建队列时，添加的键和值，故要创一个对象
        char ch;
        int num;

        me(char ch, int pos) {
            this.ch = ch;
            this.num = pos;
        }
    }
}

