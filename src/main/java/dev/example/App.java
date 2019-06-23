package dev.example;
import java.util.*;

import java.math.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10, 21}; 
         int n = arr.length; 
         int newArray[] = new int[arr.length+1];
         Arrays.sort(arr); 
         for (int i = 0; i < n; i++) 
         { 
        	 while (i < n - 1 && arr[i] == arr[i + 1]) 
                 i++; 
       
             // print last occurrence of  
             // the current element 
             
             newArray[i]=arr[i];
             System.out.println(newArray[i] +" "); 
         } 
         int i, first, second; 
         
         /* There should be atleast two elements */
         if (newArray.length < 2) 
         { 
             System.out.print(" Invalid Input "); 
             return; 
         } 
         first = second = Integer.MIN_VALUE; 
         for (i = 0; i < newArray.length ; i++) 
         { 
             /* If current element is smaller than  
             first then update both first and second */
             if (newArray[i] > first) 
             { 
                 second = first; 
                 first = newArray[i]; 
             } 
        
             /* If arr[i] is in between first and  
                second then update second  */
             else if (newArray[i] > second && newArray[i] != first) 
                 second = newArray[i]; 
         } 
         if (second == Integer.MIN_VALUE) 
             System.out.print("There is no second largest"+ 
                                 " element\n"); 
        else
             System.out.println("The second largest element"+ 
                                      " is "+ second);
    }
   

 

   
        
       
        }
  

