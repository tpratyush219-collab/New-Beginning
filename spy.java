import java.util.Scanner;
class spy
{
    int n,d,p=1,s=0;
    void display()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a no.");
       n=sc.nextInt();
       while(n>0)
       {
           d=n%10;
           s=s+d;
           p=p*d;
           n=n/10;
       }
       if(s==p)
       {
           System.out.println("It is a Spy number");
       }
       else
       {
           System.out.println("It is not a Spy number");
       }
    }
}


    
