import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        System.out.println("MENU : "
                + "\n" + "1. Create array"
                + "\n" + "2. Add integer in the back"
                + "\n" + "3. Delete number"
                + "\n" + "4. Put number"
                + "\n" + "5.Write all array"
                + "\n" + "6. Exit"
                + "\n"
                + "\n" + "Write a number of comand :");


        Scanner scanner = new Scanner(System.in);
        //System.out.println("Write a number of command: ");
        int number = scanner.nextInt();

        int count = 0;

        int array[] = null;

        while (number != 6) {

            switch (number) {
                case 1:

                    System.out.println("Write count of numbers in array : ");
                    int m = scanner.nextInt();
                    array = new int[m];

                    System.out.println("MENU : "
                            + "\n" + "1. Create array"
                            + "\n" + "2. Add integer in the back"
                            + "\n" + "3. Delete number"
                            + "\n" + "4. Put number"
                            + "\n" + "5.Write all array"
                            + "\n" + "6. Exit"
                            + "\n"
                            + "\n" + "Write a number of comand :");

                    number = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Write one number :");
                    int newNumber = scanner.nextInt();

                    array[count] = newNumber;
                    count++;


                    System.out.println("MENU : "
                            + "\n" + "1. Create array"
                            + "\n" + "2. Add integer in the back"
                            + "\n" + "3. Delete number"
                            + "\n" + "4. Put number"
                            + "\n" + "5.Write all array"
                            + "\n" + "6. Exit"
                            + "\n"
                            + "\n" + "Write a number of comand :");

                    number = scanner.nextInt();
                    break;

                case 3:

                    System.out.println("Write index of number, which u want delete :");
                    int index = scanner.nextInt();

                    for (int i = index; i < array.length - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    array[array.length - 1] = 0;


                    System.out.println("MENU : "
                            + "\n" + "1. Create array"
                            + "\n" + "2. Add integer in the back"
                            + "\n" + "3. Delete number"
                            + "\n" + "4. Put number"
                            + "\n" + "5.Write all array"
                            + "\n" + "6. Exit"
                            + "\n"
                            + "\n" + "Write a number of comand :");

                    number = scanner.nextInt();
                    break;

                case 4:

                    System.out.println("Write index and integer, which u want put in array:");
                    index = scanner.nextInt();
                    int integer = scanner.nextInt();

                    for(int i = array.length-1; i>index; i--){
                    	 array[i] = array[i-1];  
                    }

                    for (int i = 0; i < array.length - 1; i++) {
                        if (i == index) {
                            array[i] = integer;
                        }
                    }


                    System.out.println("MENU : "
                            + "\n" + "1. Create array"
                            + "\n" + "2. Add integer in the back"
                            + "\n" + "3. Delete number"
                            + "\n" + "4. Put number"
                            + "\n" + "5.Write all array"
                            + "\n" + "6. Exit"
                            + "\n"
                            + "\n" + "Write a number of comand :");


                    number = scanner.nextInt();
                    break;


                case 5:

                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }

                    System.out.println("MENU : "
                            + "\n" + "1. Create array"
                            + "\n" + "2. Add integer in the back"
                            + "\n" + "3. Delete number"
                            + "\n" + "4. Put number"
                            + "\n" + "5.Write all array"
                            + "\n" + "6. Exit"
                            + "\n"
                            + "\n" + "Write a number of comand :");

                    number = scanner.nextInt();
                    break;


            }

        }
    }
}

