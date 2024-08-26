package day2;

public class exam4 {
    public static void main(String args[] ) {
        int height = 3;

        System.out.println("높이 : " + "[" + height + "]");
        for(int i = 0; i < height + 1; i++) {
            for(int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*

    높이 : [3]

      *
     **
    ***

    */

    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */

    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */
    }
}
