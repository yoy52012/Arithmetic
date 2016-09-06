/**
 *
 * Descrption:对于两个字符串，请设计一个时间复杂度为O(m*n)的算法(这里的m和n为两串的长度)，求出两串的最长公共子串的长度。
 *
 * 测试样例：
 * 输入："1AB2345CD","12345EF"
 * 输出： 4
 */
public int LCSstring(String s1,String s2){
	int len1=s1.length();
	int len2=s2.length();
	int maxLen=len1>len2?len1:len2;
	
	int[] dp=new int[maxLen];
	int max=0;
	for(int i=0;i<len1;i++){
		for(int j=len2-1;j>=0;j--){
			if(s1.charAt(i)==s2.charAt(j)){
				if(i==0||j==0){
					dp[j]=1;
				}else{
					dp[j]=dp[j-1]+1;
				}
			}else{
				dp[j]=0;
			}
			max=max>dp[j]?max:dp[j];
		}
	}
	return max;
}