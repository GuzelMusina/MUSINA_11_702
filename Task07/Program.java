import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[]=new int[n];

		for (int i = 0; i<a.length;i++){
			a[i]=scanner.nextInt();
		}

		for(int i = a.length-1;i>=0;i-- ){
			for(int j = 0; j<i; j++){
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
			}
		}
	}
	for(int i = 0; i<a.length; i++){
	System.out.println(a[i] + " ");
}}}