import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int x = n;
     int sum = 0;
      while(n>0)
      {
        int fact = 1;
        int rem = n%10;
      for(int i=1;i<=rem;i++)
        	fact = fact*i;
       sum = sum +fact;
       n = n/10; 
      }
      if(sum==x)
      System.out.println("Yes");
      else
	    System.out.println("No");
	}
}
