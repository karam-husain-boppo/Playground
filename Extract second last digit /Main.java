
import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
	    int num1=num%100;
        int sec=num1/10;
		System.out.println(sec);
	}
}

