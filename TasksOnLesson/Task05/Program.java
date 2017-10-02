import java.util.Scanner; 

class Program{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int b[] = new int[n]; 
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 0; i<b.length; i++){
			b[i] = scanner.nextInt();
		}	
		int max= b[0];
		int min= b[0];

		for(int i = 0; i<b.length-1; i++){
			if (b[i]>max){
				max=b[i];
				maxIndex = i;
			}
			if (b[i]<min){
				min=b[i];
				minIndex = i;
			}
		}
		b[minIndex] = max;
		b[maxIndex] = min;
		for(int i=0; i<b.length; i++){
		System.out.println(b[i] + " ");
		}
	}
}
