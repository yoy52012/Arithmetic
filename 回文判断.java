/**
 * Description:����һ���ַ������ж�����ַ����Ƿ�Ϊ���Ĵ���for example��madam��abba.
 *
 */
 
 //���������м�ɨ��
 public boolean isPalindrome(String str){
	 if(str==null){
		 reurn false;
	 }
	 int i=0;
	 int j=str.length()-1;
	 while(i<j){
		 if(str.charAt(i)!=str.charAt(j)){
			 return false;
		 }
		 i++;
		 j--;
	 }
	 return true;
 }
 
 //���м�������ɨ��
 public boolean isPalindrome2(String str){
	 if(str==null){
		 return false;
	 }
	 int n=str.length();
	 int m=((n>>1)-1)>=0?(n>>1)-1:0;  //Amazing!!!!!+_+
	 int i=m;
	 int j=n-1-m;
	 while(i>=0){
		 if(str.charAt(i)!=str.charAt(j)){
			 return false;
		 }
		 i--;
		 j++;
	 }
	 return true;
 }
 
