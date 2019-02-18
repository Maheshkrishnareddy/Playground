import java.util.Scanner;
class Main{
	public static void main (String[] args){
  Scanner in=new Scanner(System.in);
      int rows=in.nextInt();
    int i, j, number= 1;

    int t=rows;

    for(i=1; i <= rows; i++)
    {
      for(int s=0;s<rows-i;s++)
        System.out.print(" ");
        for(j=1; j <= i; ++j)
        {
            System.out.print(number+" ");
      
            ++number;
        }

        System.out.println();
    }

    
    }    
}
       
