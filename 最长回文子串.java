/**
 *
 * Description: ����һ���ַ�����������������Ӵ��ĳ���
 *
 */

 public int LongestPalindrome(String str){
	 if(str==null){
		 return 0;
	 }
	 int max=0;
	 int c=0;
	 int n=str.length();
	 int i;
	 int j;
	 for(i=0;i<n;i++){
		 //���Ĵ�Ϊ����
		 for(j=0;(i-j)>=0&&(i+j)<n;j++){
			 if(str.charAt(i-j)!=str.charAt(i+j)){
				 break;
			 }
			 c=j*2+1;
		 }
		 if(c>max){
			 max=c;
		 }
		 
		 //����Ϊż��
		 for(j=0;(i-j)>=0&&(i+j+1)<n;j++){
			 if(str.charAt(i-j)!=str.charAt(i+j+1)){
				 break;
			 }
			 c=j*2+2;
		 }
		 if(c>max){
			 max=c;
		 }
	 }
	 return max;
 }