import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner n=new Scanner(System.in);
                int a=n.nextInt();
                int b,c,d;
                b=a%10;
                a/=10;
                c=a%10;
                a/=10;
                d=a%10;
                System.out.println(b*100+c*10+d*1);
  }
}