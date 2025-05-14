package patterns;
public class Butterfly {
    public static void main(String[] args) {
        for (int rowNumber = 1; rowNumber <= 8; rowNumber++) { // should be a multiple of 8, say x
            for (int colNumber = 1; colNumber <= 8; colNumber++) {
                if (rowNumber <= 5) { // can change the value of number as (x/2 + 1)
                    if (rowNumber % 2 != 0) {
                        if (colNumber <= rowNumber || (8 - colNumber + 1) <= rowNumber)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    } else {
                        if (colNumber == rowNumber || (8 - colNumber + 1) == rowNumber)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                } else if (rowNumber != 6) { // value should be (x/2 + 2)
                    if (rowNumber % 2 != 0) {
                        if (colNumber == rowNumber || (8 - colNumber + 1) == rowNumber)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    } else {
                        if (colNumber >= rowNumber || (8 - colNumber + 1) >= rowNumber)
                            System.out.print("*");   
                        else
                            System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}


/*


12345678
*      * 1
 *    *  2
***  *** 3
   **    4
******** 5
         6
 *    *  7
*      * 8


for row in rows
    for col in cols
        if (rowNumber <= 5)
            if (rowNumber is odd)
                if (colNumber <= rowNumber || (8 - colNumber + 1) <= rowNumber)
                    then print *
            else <rowNumber is even>
                if (colNumber == rowNumber || (8 - colNumber + 1) == rowNumber)
                    then print *
        else if (rowNumber != 6)
            if (rowNumber is odd)
                if (colNumber == rowNumber || (8 - colNumber + 1) == rowNumber)
                    then print *
            else <rowNumber is even>
                if (colNumber >= rowNumber || (8 - colNumber + 1) >= rowNumber)
                    then print *
    println
 */