package random;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class swap {
    // Method to swap two numbers
    public static void swapMethod(MutableInteger a, MutableInteger b) {
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
    public static void main(String[] args) {

        // Creating wrapper objects
        MutableInteger a = new MutableInteger(5);
        MutableInteger b = new MutableInteger(10);

        System.out.println("Before swap: a = " + a.getValue() + ", b = " + b.getValue());

        // Call the method to swap numbers
        swapMethod(a, b);

        System.out.println("After swap: a = " + a.getValue() + ", b = " + b.getValue());
    }

   static class MutableInteger {
       private int value;

       public MutableInteger(int value) {
           this.value = value;
       }

       public int getValue() {
           return value;
       }

       public void setValue(int value) {
           this.value = value;
       }
   }
}
