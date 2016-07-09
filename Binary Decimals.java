import java.util.*;
/**
 * 题目描述：
 */
public class BinDecimal {
    public String printBin(double num) {
        // write code here
        if(num>=1||num<=0)
            return "Error";
        StringBuilder sb=new StringBuilder();
        sb.append(0);
        sb.append(".");
        while(num!=0){
           if(sb.length()>32)
                return "Error";
           double r=num*2;
           if(r>=1){
               sb.append(1);
               num=r-1;
           }else{
               sb.append(0);
                numm=r;
           }
        }
        return sb.toString();
    }
}