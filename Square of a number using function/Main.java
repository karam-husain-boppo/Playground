import java.util.Scanner;
class Main
{
  public static int squre_of_number(int n)
  {
    int squre =n*n;
    return squre;
  }
	public static void main (String[] args)
    {
    Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
     int squre =squre_of_number(n1);
      System.out.println(squre);
	 // Type your code here   
	} 
}