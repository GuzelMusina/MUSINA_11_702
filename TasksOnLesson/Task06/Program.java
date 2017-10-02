import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[]=new int[n];
		int min = a[0]; 
		int minIndex = 0; 
		int temp; 

		for (int i = 0; i<a.length;i++){
			a[i]=scanner.nextInt();
		}
		
	for(int i = 0; i<a.length;i++){
		for(int j = i; i<a.length-1; i++){
			if (a[j]<min){
				min= a[j];
				minIndex = i; 
			}
		}
		temp = a[i];
		a[i] = a[minIndex];
		a[minIndex] = temp;

		}
	
	for(int i = 0; i<a.length; i++){
	System.out.println(a[i] + " ");
}}}