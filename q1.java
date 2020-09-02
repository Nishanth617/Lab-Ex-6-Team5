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
public class q1 {
     public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("MANAGER");
        manager obj1=new manager();
        obj1.toString();
        System.out.println("Enter the works hours");
        double h= obj.nextDouble();
        System.out.println(obj1.CalcSalary(h));
         manager obj2=new manager();
        obj2.toString();
        System.out.println("Enter the works hours");
        double b= obj.nextDouble();
        System.out.println(obj2.CalcSalary(b));
        System.out.println("CLERK");
         clerk j=new clerk();
        j.toString();
        System.out.println("Enter the works hours");
        double k= obj.nextDouble();
        System.out.println(j.CalcSalary(k));
    }
    
}
abstract class employee
{
   String name;
   int age,hourrate;
   
    void toString();
   abstract double CalcSalary(double hourrate);
 }
class manager extends employee
{
    Scanner in=new Scanner(System.in);
    String name;
   int age,hourrate; 
    
 public void toString(){  
System.out.println("Enter ur name");
name=in.next();
System.out.println("Enter ur age");
age=in.nextInt();
System.out.println("NAME:"+name);  
System.out.println("AGE:"+age);
 }
 double CalcSalary(double hourrate)
 {
   if(hourrate<=4)
   {
     return 100000;
   }
   else if ((hourrate>4)&&(hourrate<=8))
   {
    return 200000;   
   }
   if(hourrate>8)
   {
     return 500000;
   }
        return 0;
 }
}
class clerk extends employee
{
    Scanner in=new Scanner(System.in);
    String name;
   int age,hourrate; 
    
 public void toString(){  
System.out.println("Enter ur name");
name=in.next();
System.out.println("Enter ur age");
age=in.nextInt();
System.out.println("NAME:"+name);  
System.out.println("AGE:"+age);
}
 double CalcSalary(double hourrate)
 {
   if(hourrate<=4)
   {
     return 10000;
   }
   else if ((hourrate>4)&&(hourrate<=8))
   {
    return 20000;   
   }
   if(hourrate>8)
   {
     return 25000;
   }
        return 0;
 }
}

