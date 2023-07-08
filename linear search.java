import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int array [] = new int [100];

        Scanner sc = new Scanner (System.in);
        System.out.println("enter array size");
        int a = sc.nextInt();
        System.out.println("enter key");
        int b = sc.nextInt();
        System.out.println("enter array elements");

        for (int i=0; i<a;i++)
        {
            array[i]=sc.nextInt();
            
        }


          for (int i=0; i<a;i++)
          {
              if (array[i]==b)
              {
                  System.out.println("found at position" +" " + i);
                  break;
              }
              else if(i==a-1  && array[i]!=b)
              {
                  System.out.println("element not found");

              }

              
          }
          


    }
}
