// GRPA-1

import java.util.*;
//Define DivisionException class here
class DivisionException extends Exception {
    @Override
    public String toString() {
        return "Division by 3 is not allowed";
    }
}

public class Test {
 
    //Define divide(int a, int b) here
    public int divide(int a, int b) throws DivisionException {
        if (b == 3) {
            throw new DivisionException();
        } else {
            return a/b;
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       
       //call divide method here
       Test test = new Test();
       try {
           int result = test.divide(x, y);
           System.out.println(result);
       } catch (DivisionException e) {
           System.out.println(e);
       }
   }
} 
