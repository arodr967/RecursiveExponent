package recursiveexponent;
/*
File name: RecursiveExponent.java
Test class for LinkedList class.
 */
import java.util.Scanner;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
/**
Questions:
(b) What is the running time complexity of your function? Justify.
The running time complexity is O(log(N)) because everytime
n is being divided by 2.

(c) Give a number of multiplications used by your fuctions to
calculate X^63. Justify.
Since its an odd number, it will have 2 multiplications. Everytime 63 is
divided by 2, it is an odd number. Therefore, when it reaches 1, it will 
have done 10 multiplications.
*/
public class RecursiveExponent {

    public static long exponentiation(long x, int n)
    {//*********PROPERTY OF ALICIA RODRIGUEZ**********
        return recursiveExpo(x,n);
    }
    //*********PROPERTY OF ALICIA RODRIGUEZ**********
    private static boolean isEven(int n)
    {
        int comp = n;
        return (n/2) * 2 == comp;
    }
    private static long recursiveExpo(long x, int n)
    {//*********PROPERTY OF ALICIA RODRIGUEZ**********
        //trivial cases:
        if (n == 0)
            return 1;
        if(n == 1)
            return x;
        //recursive calls:
        if(isEven(n))
            return recursiveExpo(x * x, n / 2);//*********PROPERTY OF ALICIA RODRIGUEZ**********
        else
            return recursiveExpo(x * x, n / 2) * x;
    }
    //*********PROPERTY OF ALICIA RODRIGUEZ**********
    public static void main(String[] args) 
    {
        System.out.println("--Exponential--");
        Scanner input = new Scanner(System.in);
        //*********PROPERTY OF ALICIA RODRIGUEZ**********
        System.out.print("What number do you want "
                + "to multiply multiple times? ");
        long x = input.nextLong();
        //*********PROPERTY OF ALICIA RODRIGUEZ**********
        System.out.print("How many times do you want to multiply "
                + x + "? ");
        int n = input.nextInt();
        
        long answer = exponentiation(x, n);
        
        System.out.println(x + "^" + n + " = " + answer);
        //*********PROPERTY OF ALICIA RODRIGUEZ**********
    }
  //*********PROPERTY OF ALICIA RODRIGUEZ**********  
}//end of RecursiveExponent class definition
