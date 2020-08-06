package Leetcode.array;

/**
 * @author wym
 */

/**
 *  加油站
 * 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 *
 * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = cost.length;
        for (int i = 0; i < length; i++){
            int sum = 0;
            if (cost[i] > gas[i]){
                continue;
            }

            int next = (i + 1) % length;
            sum = gas[i] - cost[i];

            while(next != i){
                sum = sum + gas[next] - cost[next];
                if (sum < 0){
                    break;
                }
                next = (next + 1) % length;
            }
            if (next == i){
                return i;
            }
        }
        return -1;
    }
}
