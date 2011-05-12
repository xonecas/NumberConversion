// sean caetano martin
// seancaetanomartin@gmail.com
// cis 255 hy
// NumberConversion
// converts decimal numbers to binary, hex, octal.
// assign 1
// Wednesday, February 02 2011

public class NumberConversion {

   public static String convertToBinary (int decimal) {

      // local variables
      int remainder = 0;
      String binary = "";

      // division by 2 with remainder
      // continue while the quotient != 0
      do {

         // save the integer value of the remiander (1 || 0)
         remainder = decimal % 2;
         // divide the number by 2 and capture the quotient
         decimal = decimal / 2;

         // build our binary number in reverse order
         binary = remainder + binary; 

      } while (decimal != 0);

      // return our binary number
      return binary;

   }

   public static String convertToOctal (int decimal) {
   
      // local variables
      int remainder = 0;
      String octal = "";

      // division by 8 with remainder
      // while the quotient != 0
      do {

         // save the integer value of the remainder
         remainder = decimal % 8;
         // save the quotient
         decimal = decimal / 8;

         // build the octal number
         octal = remainder + octal;

      } while (decimal != 0);

      // return the octal number
      return octal;
   }

   public static String convertToHexadecimal (int decimal) {
   
      // local variables
      int remainder = 0;
      String hex = "";
      String hexValues = "0123456789ABCDEF";

      // division by 16 with remainder
      // while the quotient != 0
      do {

         // save the integer value of the remainder
         remainder = decimal % 16;
         // save the quotient
         decimal = decimal / 16;

         // build the hex number
         hex = hexValues.charAt(remainder) + hex;

      } while (decimal != 0);

      // return the hex number
      return hex;
   }
}
