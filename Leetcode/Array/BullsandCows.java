package Leetcode.Array;

import java.util.HashMap;

/**
 * @author wym
 */

/**
 * 题目 ： 299. 猜数字游戏
 * 你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：
 *
 * 你写出一个秘密数字，并请朋友猜这个数字是多少。
 * 朋友每猜测一次，你就会给他一个提示，告诉他的猜测数字中有多少位属于数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位属于数字猜对了但是位置不对（称为“Cows”, 奶牛）。
 * 朋友根据提示继续猜，直到猜出秘密数字。
 * 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，返回字符串的格式为 xAyB ，x 和 y 都是数字，A 表示公牛，用 B 表示奶牛。
 *
 * xA 表示有 x 位数字出现在秘密数字中，且位置都与秘密数字一致。
 * yB 表示有 y 位数字出现在秘密数字中，但位置与秘密数字不一致。
 * 请注意秘密数字和朋友的猜测数都可能含有重复数字，每位数字只能统计一次。
 *
 */
public class BullsandCows {
    public String getHint(String secret, String guess) {
        char[] s=secret.toCharArray();
        char[] g=guess.toCharArray();
        int a=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==g[i]){
                a++;
                s[i]='x';
                g[i]='y';
            }
        }

        int b=0;
        for(int j=0;j<s.length;j++){
            for(int k=0;k<g.length;k++){
                if(s[j]==g[k]){
                    b++;
                    s[j]='x';
                    g[k]='y';
                    break;
                }
            }
        }
        return a+"A"+b+"B";
    }
}
