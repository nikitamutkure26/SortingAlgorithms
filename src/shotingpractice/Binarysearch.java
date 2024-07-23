package shotingpractice;

public class Binarysearch {
	public static void main(String[] args) {
		int[] a= {1,2,4,5,6};
		System.out.println(search(a,5));
	}
	public static int search(int[] a,int key) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
		int mid=(start+end)/2;
		if(a[mid]==key)return mid;
		if(key>a[mid]) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}}
		return -1;
	}

}
