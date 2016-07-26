import java.util.*;

/**
 * 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
 * 给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
 *
 * 思路：
 * 走出一条路径实际是要走x+y步，故所求总的路径数为从x+y步里面选出x步为向右移动。
 * 由排列组合的知识可知：C（x+y,x）=(x+y)/x!*y!
 */
public class Robot {
    public int countWays(int x, int y) {
        // write code here
        int n=x+y-2;
        int a=1,b=1,c=1;
        for(int i=n;i>0;i--){
            a *=i;
        }
        for(int i=x-1;i>0;i--){
            b *=i;
        }
        for(int i=y-1;i>0;i--){
            c *=i;
        }

        return a/(b*c);
    }
}