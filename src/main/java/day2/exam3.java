package day2;

public class exam3 {
    public static void main(String args[]) {
        int height = 3;
//        int width = 3;

        System.out.println("높이 : " + "[" + height + "]");
        for(int i = 0; i < height; i++) {
            for(int j = 0; j <= i; j++) {
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
