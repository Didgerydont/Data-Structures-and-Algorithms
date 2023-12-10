package BigO;

public class DropNonDominants {

    public static void printItems(int n) {
        // First pair of nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // This operation is O(1), but since it's inside nested loops,
                // it will execute n*n times. Thus, this part is O(n^2).
                System.out.println(i + "" + j);
            }
        }

        // Second loop
        for (int k = 0; k < n; k++) {
            // This operation is also O(1), and the loop runs 'n' times.
            // Hence, this part is O(n).
            System.out.println(k);
        }

        // When combining the complexities, we have O(n^2) from the nested loops
        // and O(n) from the single loop. The combined complexity would be O(n^2 + n).
        // However, when dropping non-dominant terms, we only keep O(n^2),
        // because as 'n' grows larger, the n^2 term dominates and the n term
        // becomes less significant in comparison.
    }

    public static void main(String[] args) {
        // Calling printItems with 10. The overall complexity is O(n^2),
        // with the non-dominant O(n) term dropped.
        printItems(10);
    }
}

//    O(n^2 + n): Initially, when combining the complexities of the nested loops (O(n^2)) and the single loop (O(n)), you get O(n^2 + n).
//    Dropping Non-Dominant Terms: In Big O notation, we are interested in the upper bound of the runtime as 'n' grows very large.
//    The term O(n) becomes insignificant compared to O(n^2) as 'n' increases. Therefore, we drop O(n) and represent the overall complexity as O(n^2).