package Leetcode.Array;

import java.util.Random;

/**
 * @author wym
 */

/**
 * 题目： 277 Find the Celebrity
 * 在一个派对上有n个人，其中有一位名人。名人的定义是其他n-1个人都认识他，但他不认识任何一个人。
 * 要找出这位名人，只允许问A是否认识B。实施一个函数，找出名人，如果有返回他的label，如果没有返回-1。
 */
public class FindTheCelebrity {
    /**
     * i 是否认识 j
     * @param i
     * @param j
     */
    public boolean know(int i , int j){
        Random random = new Random();
        int i1 = random.nextInt(11);

        return i1%2 == 0;

    };
    public int FindTheCelebrity(int n){
        int candidate = 1;
        for (int i=1; i<=n;i++){
            if (!know(i, candidate)){
                candidate = i;
            }
        }
        for (int i=1; i<=n; i++){
            if (i != candidate && know(candidate, i) || !know(i, candidate)){
                return -1;
            }
        }
        return candidate;
    }

}
