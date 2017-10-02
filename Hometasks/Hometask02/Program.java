import java.util.Scanner;

class Program{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = 99999;
		int max = 0; 

		while(n!=-1){
			if (n<min) {
				min=n; 
			}else{
				max=n;
			}n = scanner.nextInt(); 
		}System.out.println(max-min); 
	}
}