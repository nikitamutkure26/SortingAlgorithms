package shotingpractice;

public class SelectionDemo {
	public static void main(String[] args) {
		int[] a= {9,4,8,1,3};
		sort(a);
		for(int n:a) {
			System.out.println(n);
		}
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[index]>a[j]) {
					index=j;
				}
				
				
			}
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
	}

}
