/*2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)*/

import java.util.*;
import java.io.*;
import java.lang.Math;
public class Roman {
   public static void main(String args[]) {
      Roman num= new Roman();
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a Roman Number in capital letters: ");
      String inputRoman= s.nextLine();
      System.out.println("The Integer value of given Roman number is:"+num.romanToInt(inputRoman));
   }
   int NumValue(char r){
      if (r == 'I')
         return 1;
      if (r == 'V')
         return 5;
      if (r == 'X')
         return 10;
      if (r == 'L')
         return 50;
      if (r == 'C')
         return 100;
      if (r == 'D')
         return 500;
      if (r == 'M')
         return 1000;
      return -1;
   } 
   int romanToInt(String str) {
      int sum = 0;
      for (int i=0; i<str.length(); i++) {
         int s1 = NumValue(str.charAt(i));
         if (i+1 <str.length()) {
            int s2 = NumValue(str.charAt(i+1));
            if (s1 >= s2) {
               sum = sum + s1;
            }
            else {
               sum = sum - s1;
            } 
         }
         else {
            sum = sum + s1;
         } 
      }
      return sum;
   } 
} 
