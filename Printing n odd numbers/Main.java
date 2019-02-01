import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code he
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 1;
      for(int i =1;count<=n; i=i+2)
      {
        System.out.println(i);
      count = count +1;
      }
	}
}