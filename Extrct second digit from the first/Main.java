import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=0;
      int n2=0;
      while(n>=100)
      {
        n=n/10;
      }
      n1=n;
      n2=n1%10;
      System.out.println(+n2);
    }
}
      
     