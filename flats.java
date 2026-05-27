import java.util.Scanner; 
 class flats 
 { 
 public static void main() 
 { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the price of the flat"); 
 int price=sc.nextInt(); 
 System.out.println("Enter the development charges of the flat"); 
 int charges=sc.nextInt(); 
 System.out.println("Enter the category of floor(‘G’ for Ground Floor,‘F’ for First 
Floor, ‘S’ For Second Floor and ‘T’ For Third Floor");
 char ch=sc.next().charAt(0); 
 double dp=0.0,dc=0.0; 
 switch(ch) 
 { 
 case 'G': 
 case 'g': dp=(10*price)/100; 
 dc=(8*charges)/100; 
 break; 
 case 'F': 
 case 'f': dp=(2.0*price)/100; 
 dc=(6*charges)/100; 
 break; 
 case 'S': 
8 
 case 's': dp=(5*price)/100; 
 dc=(2*charges)/100; 
 break; 
 case 'T': 
 case 't': dp=(7.5*price)/100; 
 dc=(10*charges)/100; 
 break; 
 default: System.out.println("Invalid type of floor"); 
 } 
 double totaldisc=dc+dp; 
 double net=(price-dp)+(charges-dc); 
 System.out.println("The total discount is:"+totaldisc); 
 System.out.println("The price of the flat after discount is:"+net); 
 } 
 } 
