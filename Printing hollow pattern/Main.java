import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<=a;j++)
        {
          if(i==1||i==a||j==1||j==a)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
	}
}