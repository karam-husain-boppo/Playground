import java.util.Scanner;
class Main{
  public static int sum_of_number(int n)
  {
    int sum = 0;
    for(int i=0;i<=n;i++)
    {
      sum = sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1 =in.nextInt();
      int sum1 = sum_of_number(n1);
      System.out.println(sum1);
      
	    // Type your code here
	}
}