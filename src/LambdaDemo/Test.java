package LambdaDemo;

import java.util.ArrayList;

public class Test 
{
    public static void main(String args[])
    {
        // Creating an ArrayList with elements
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
  
        // Using lambda expression to print all elements
       
        arr.forEach(n -> System.out.println(n));
  
       
    }
}
