import java.util.*;

public class Transform {
    public int calcCost(int A, int B) {
        // write code here
        int count=0;
        for(int c=A^B;c!=0;c>>1){
            count +=c&1;
        }
        return count;
    }
}