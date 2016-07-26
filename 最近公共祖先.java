import java.util.*;

/**
 * 有一棵无穷大的满二叉树，其结点按根结点一层一层地从左往右依次编号，根结点编号为1。现在有两个结点a，b。请设计一个算法，求出a和b点的最近公共祖先的编号。
 * 给定两个int a,b。为给定结点的编号。请返回a和b的最近公共祖先的编号。注意这里结点本身也可认为是其祖先。
 *
 * 思路：满二叉树的子节点与父节点之间的关系为root = child / 2
 * 利用这个关系，如果a ！= b，就让其中的较大数除以2， 如此循环知道a == b，即是原来两个数的最近公共祖先 
 */
public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while(a!=b){
            if(a>b){
                a /=2;
            }else{
                b /=2;
            }
        }
        return a;
    }
}