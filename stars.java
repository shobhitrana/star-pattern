
import java.io.*; 
import java.util.Scanner;

class stars{ 
  
    static void printPattern(int n) 
    { 
        // Loop to print desired pattern 
        int curr_star = 0; 
        for (int i = n; i <= n;) 
        { 
            if (curr_star < i) 
            { 
                System.out.print ( "* "); 
                curr_star++; 
                continue; 
            } 
      
            // Else time to print a new line 
            if (curr_star == i) 
            { 
                System.out.println (""); 
                i--; 
                curr_star = 0; 
            } 
        } 
    } 
      
  
    public static void main (String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number of lines:");
    	int num = sc.nextInt();
    	printPattern(num); 
    } 
}