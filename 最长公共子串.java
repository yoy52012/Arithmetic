/**
 *
 * Descrption:���������ַ����������һ��ʱ�临�Ӷ�ΪO(m*n)���㷨(�����m��nΪ�����ĳ���)�����������������Ӵ��ĳ��ȡ�
 *
 * ����������
 * ���룺"1AB2345CD","12345EF"
 * ����� 4
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