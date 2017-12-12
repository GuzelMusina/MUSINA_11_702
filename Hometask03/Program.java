import java.util.Scanner;

class Program{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write max number of your element : ");
		int max = scanner.nextInt();
		int sum = 0; 
		int sumAll=0;
		int count=1;
		int missElement=0;
		System.out.println("Write numbers pls! ");
		int n = scanner.nextInt();
        //сумма чисел от 1 до n = n * (n+1) : 2
		while(count<max){
			sum+=n;
			count++; 
			n = scanner.nextInt(); 
		}
		missElement=((count*(count+1))/2)-sum;
		System.out.println("Missing Element is:" + missElement); 
	}
}