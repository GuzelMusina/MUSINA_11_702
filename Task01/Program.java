class Program {
	public static void main(String[] args){
		int n = 67;
		int k1 = n%2;
		n = n/2; 
		int k2 = n%2;
		n = n/2;
		int k3 = n%2;
		n = n/2;
		int k4 = n%2;
		n = n/2;
		int k5 = n%2;
		n = n/2;
		int k6 = n%2;
		n = n/2;
		int k7 = n%2;

		System.out.println(k7 +" "+  k6+ " " + k5 +" "+ k4+" " + k3+ " "+ k2+" "+ k1);
		

}
}