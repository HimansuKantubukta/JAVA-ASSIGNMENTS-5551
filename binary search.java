
import java.util.*;
class Main
{
public static void main(String[] args)
{
     int Array[] =new int[10];
    
      
     Scanner sc=new Scanner(System.in);
     System.out.println("enter array size");
     int n=sc.nextInt();
     System.out.println("enter key value");
     int k=sc.nextInt();
     int first = 0;
     int last=Array.length-1;
     int mid = (first + last)/2; 
     
     for(int i=0;i<n;i++)
     {
         Array[i]=sc.nextInt();
         
     }
    
     while(first<=last)
     {
         if(Array[mid] < k)
        {  
            first = mid + 1;    
        }
       
        else if(Array[mid] == k )
        {
           
            System.out.println("Element is found at index: " + mid);  
            break;  
        }
        else
        {
           
            last = mid - 1;  
        }
       
        mid = (first+last)/2;  
   }  
   if(first>last)
   {  
      System.out.println("Element is not found!");  
   }
}
}




