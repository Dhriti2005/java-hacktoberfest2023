fibonnaci search
  import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		 Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to generate in fibonacci series- ");
        int n = scn.nextInt();
        if(n < 0) {
            System.out.println("N cannot be negative");
            return;
        }
        int a = 0; //0th fibonacci number
        int b = 1; //1st fibonacci numbe// r
        System.out.print("The generated fibonacci series is- ");
        System.out.print(a+"\t"+b+"\t");

        if(n == 0) System.out.println(a);
        else if(n == 1) System.out.println(b);

		else {
            int c = 0;
            for(int i=2;i<n;i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c+"\t");
            }
        }

    }
}
