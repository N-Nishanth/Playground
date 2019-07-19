import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
     int reversed=0;
    while(n1!=0)
    {
        int digit=n1%10;
     reversed=reversed*10+digit;
      n1/=10;
    }
    System.out.println(+reversed);//Type your code here
  }
}