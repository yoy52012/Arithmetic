import java.util.*;

public class Subset {
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
        Arrays.sort(A);
       ArrayList<ArrayList<Integer>> res= getSubsetsCore(A,n);
       return res;
    }

    public ArrayList<ArrayList<Integer>> getSubsetsCore(int[] A,int n){
            ArrayList<ArrayList<Integer>>  resList=new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> list;
            if(n==1){
                list=new ArrayList<Integer>();
                list.add(A[0]);
                resList.add(list);
                return resList;
            }
            resList=getSubsetsCore(A,n-1);

            for(int i=0;i<resList.size();i++){
               list=resList.get(i);
               list.add(A[n]);
               for(int j=0;j<tmp.get(i).size();j++){
                   list.add(tmp.get(i).get(j));
               }
               resList.add(list);
            }
            list=new ArrayList<Integer>();
            list.add(A[n]);
            resList.add(list);
            return resList;
    }
}