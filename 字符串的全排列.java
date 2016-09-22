
/**
 * 字符串的全排列，考虑了字符串中有重复字符的问题("aab"->aab,aba,bba)
 */

	public void perm(char[] s,int start,int n){
		if(start==n){
			for(int i=0;i<n;i++){
				System.out.print(s[i]);
			}
			System.out.println();
		}else{
			for(int i=start;i<n;i++){
				if(isSwap(s,start,i)){
				swap(s,start,i);
				perm(s,start+1,n);
				swap(s,start,i);
				}
			}
		}
	}
	
	public  boolean isSwap(char[] s,int start,int end){
		for(int i=start;i<end;i++){
			if(s[i]==s[end]){
				return false;
			}
		}
		return true;
	}
	
	public  void swap(char[] s,int i,int j){
		if(i!=j){
			char tmp=s[i];
			s[i]=s[j];
			s[j]=tmp;
		}
	}
