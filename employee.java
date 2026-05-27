import java.util.Scanner;
 class employee
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the employee"); System.out.println("Enter the annual taxable income");

String name=sc.next();

int income=sc.nextInt(); System.out.println("Enter the type of employee('M' for Male and 'F' for Female");

char gender=sc.next().charAt(0);

double tax=0.0;

switch(gender)
{
case 'M':
case 'm': if(income<=200000) tax=0.0;

else if(income>=200001&&income<=350000)

tax=(20*(income-200000))/100;
else if(income>-350001&&income<=650000)

tax=15000+(25* (income-350000))/100;

tax=30000+(30* (income-650000))/100;

else

else if(income>=200001&&income<=350000)

tax =(15*(income-200000))/100;

else if(income>=350001&&income<=650000)

tax=10000+(10*(income-350000))/100;

tax=25000+(20*(income-650000))/100;

default: System.out.println("Invalid type of employee");

else

break ;

case 'F':

tax=0.0;

case 'f: if(income<=200000)

break;

System.out.println("The tax to be paid by the employee is:"+tax);
}
}
