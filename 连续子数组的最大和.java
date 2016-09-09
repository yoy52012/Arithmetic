/**
 *
 * Description:输入一个整形数组，数组里面有正数也有负数。数组中一个或连续的多个整数组成一个子数组。求所有子数组的和的最大值。
 */


public int FindGreatestSumofSubArray(int[] a,int n){
	if(a.length==0||n<=0){
		return 0;
	}
	int maxSum=0;
	int thisSum=0;
	for(int i=0;i<n;i++){
		thisSum+=a[i];
		if(thisSum>maxSum){
			maxSum=thisSum;
		}else if(thisSum<0){
			thisSum=0;
		}
	}
	return maxSum;
	
}
