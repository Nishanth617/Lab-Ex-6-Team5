/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
/**
 *
 * @author nishanth
 */
public  class q2
{
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        employee obj1=new employee();
        obj1.information();
        obj1.show();
        obj1.taxcal();
    }
}
interface customer
{
    void information();
    void show();
    
}
class employee implements customer
{
   Scanner in = new Scanner(System.in);
   String n,g;
   int s,t;
   
   public void information()
{
System.out.println("Enter UR NAME ");
n=in.next();
System.out.println("Enter the salary");
s=in.nextInt();
System.out.println("Enter UR gender ");
g=in.next();
}
   
   public void show()
{
  System.out.println("NAME:"+n);  
  System.out.println("salary:"+s);
  System.out.println("gender:"+g);
} 
   void taxcal()
   {
   if(s<=190000)
   {
    t=0;
     System.out.println("TAX %:"+t);
   }   
   else if((s<=200000)&&("f".equals(g)))
   {
     t=0 ;
     System.out.println("TAX %:"+t);
   }
   else if((s<=200000)&&("m".equals(g)))
   {
     t=10;  
      System.out.println("TAX %:"+t);
   }
   else if((s<=500000)&&("m".equals(g)))
   {
     t=20;  
      System.out.println("TAX %:"+t);
     
   }
   else if((s<=500000)&&("f".equals(g)))
   {
     t=10;
      System.out.println("TAX %:"+t);
   }
   else if((s>500000)&&("m".equals(g)))
   {
     t=25; 
      System.out.println("TAX %:"+t);
   }
    else if((s>500000)&&("f".equals(g)))
   {
     t=20;
      System.out.println("TAX %:"+t);
   }
   
}
}