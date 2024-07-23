package shotingpractice;

public class Quicksort {
	public static void main(String[] args) {
		int[] a= {9,5,3,1,2};
		sort(a,0,a.length-1);
		for(int n:a) {
			System.out.println(n);
		}
	}
	public static void sort(int[] a,int start,int end) {
		if(start>=end)return;
		int i=start;
		int j=end;
		int pivot=a[(start+end)/2];
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
		if(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		sort(a,start,j);
		sort(a,i,end);
		
	}
	

}
