
public int LCSstring(String s1,String s2){
	if(s1==null||s2==null){
		return 0;
	}
	int len1=s1.length();
	int len2=s2.length();
	
	int[][] dp=new int[len1+1][len2+1];
	
	for(int i=len1-1;i>=0;i--){
		for(int j=len2-1;j>=0;j--){
			if(s1.charAt(i)==s2.charAt(j)){
				dp[i][j]=dp[i+1][j+1]+1;
			}else{
				dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
			}
		}
	}
	int res=0;
	int i = 0, j = 0;
		while (i < len1 && j < len2) {
			if (s1.charAt(i) == s2.charAt(j)) {
				System.out.print(s1.charAt(i));
				res++;
				i++;
				j++;
			} else if (dp[i + 1][j] >= dp[i][j + 1])
				i++;
			else
				j++;
		}
	return res;
}