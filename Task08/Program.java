import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[]=new int[n];
		int temp;

		for (int i = 0; i<a.length;i++){
			a[i]=scanner.nextInt();
		}
		for (int i = 0; i<=a.length/2;i++){
			temp = a[i];
			a[i] = a[(a.length-1)-i];
			a[(a.length-1)-i] = temp; 
		}

		for(int i = 0; i<a.length; i++){
		System.out.println(a[i] + " ");
		}
	}
}