import java.util.*;

/**
 * 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，新建一个栈。该数据结构应支持与普通栈相同的push和pop操作。 
 * 给定一个操作序列int[][2] ope(C++为vector<vector<int>>)，每个操作的第一个数代表操作类型，若为1，则为push操作，后一个数为应push的数字；若为2，则为pop操作，后一个数无意义。
 * 请返回一个int[][](C++为vector<vector<int>>)，为完成所有操作后的SetOfStacks，顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法。
 */
public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> setStack=new ArrayList<ArrayList<Integer>>();
        setStack.add(new ArrayList<Integer>());
        for(int i=0;i<ope.length;i++){
           int cmd = ope[i][0];
           int data = ope[i][1];
            ArrayList<Integer> currentList=setStack.get(setStack.size()-1);
           if(cmd==1){
              
               if(currentList!=null&&currentList.size()<size){
                   currentList.add(data);
               }else{
                   ArrayList<Integer> newList=new ArrayList<Integer>();
                   newList.add(data);
                   setStack.add(newList);
               }
           }else if(cmd==2){
               if(currentList!=null){
                   currentList.remove(currentList.get(currentList.size()-1));
                   if(currentList.size()==0){
                       setStack.remove(setStack.size()-1);
                   }
               }
           }
        }
        return setStack;


    }
}