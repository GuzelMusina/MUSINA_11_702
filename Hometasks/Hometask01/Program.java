import java.util.Scanner; 

class Program{
	public static void main (String[] args){
		//Посчитать произведение чисел, сумма цифр которых - четное число, и сумму чисел, оканчивающихся на 7.
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt();
		int mult = 1;
		int count = 0;
		int sum = 0; 
		//сумма цифр четная, если нечетных слагаемых четное кол-во
		while (n != -1){
			if(n%2 ==1){
				mult = mult*n;
				count++;
			}else{
				mult = mult*n;
			}
			if(n%10==7){
				sum+=n;
			}
			n = scanner.nextInt();
			}

			if(count%2==0){
				System.out.println("Multiple of even numbers is: " + mult);
			}else{
				System.out.println("Sum is odd");
			}
			System.out.println("Sum of numbers ending 7 is: " + sum);
		}
	}
