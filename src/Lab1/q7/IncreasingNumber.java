package Lab1.q7;

import java.util.*;
public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         boolean flag=false;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Number");
         int num=sc.nextInt();
         int currentdigit=num%10;
         num=num/10;
         while(num>0)
         {
        	 if(currentdigit<=num%10)
        	 {
        		 flag=true;
        		 break;
        	 }
        	 currentdigit=num%10;
        	 num=num/10;
         }
         if(flag)
         {
        	 System.out.println("Increasing order");
         }
         else
         {
        	 System.out.println("Decreasing order");
         }
         
         
	}

}
