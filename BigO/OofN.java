package BigO;

public class OofN {

    // This method prints the numbers from 0 to n-1
    public static void printItems(int n) {
        // The loop runs 'n' times. Each iteration is O(1), so the loop is O(n).
        for(int i = 0; i < n; i++) {
            // The printing operation is considered O(1) - constant time operation.
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Calling printItems with 10. This will result in the loop inside the method
        // being executed 10 times. The overall complexity of this call is O(n),
        // where 'n' is the argument passed, which is 10 in this case.
        printItems(10);
    }
}
//    O(n): The for loop in printItems method runs 'n' times (from 0 to n-1). Therefore, the time complexity of this method is O(n). The "n" in this context represents the
//    number of iterations, which is determined by the input n.
//    O(1): The System.out.println(i); inside the loop is a constant time operation. Regardless of the value of n, printing a single item takes the same amount of time.