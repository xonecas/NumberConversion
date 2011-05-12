// sean caetano martin
// seancaetanomartin@gmail.com
// cis 255 hy
// NumberConversionTest
// converts decimal numbers to binary, hex, octal.
// assign 1
// Wednesday, February 02 2011

public class NumberConversionTest {

   public static void main (String[] args) {

      // local variables
      int looper = 0;
      String binary = "";
      String octal = "";
      String hex = "";

      // print header
      System.out.print("\nProgrammed by Sean Caetano Martin\n"+
         "Decimal        Binary         Octal          Hexadecimal\n");

      // loop and print all the numbers
      while (looper++ != 256) {
         System.out.printf("%-15d%-15s%-15s%-15s\n",
            looper, 
            NumberConversion.convertToBinary(looper),
            NumberConversion.convertToOctal(looper),
            NumberConversion.convertToHexadecimal(looper)
         );
      }
      // clean output
      System.out.print("\n");
   }
}
