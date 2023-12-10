package BigO;

public class OofNSquared {

    // This method prints pairs of numbers for each combination of i and j
    public static void printItems(int n) {
        // Outer loop runs 'n' times.
        for (int i = 0; i < n; i++) {
            // Inner loop also runs 'n' times for each iteration of the outer loop.
            for (int j = 0; j < n; j++) {
                // The printing operation is O(1), but it's inside two nested loops,
                // so this line will execute n*n times.
                System.out.println(i + "" + j);
            }
        }
        // Overall, the nested loops result in O(n^2) complexity,
        // as each loop contributes a factor of 'n' to the total number of iterations.
    }

    public static void main(String[] args) {
        // Calling printItems with 10. This will result in O(n^2) complexity,
        // with 'n' being 10, leading to 100 (10*10) total iterations.
        printItems(10);
    }
}

//    O(n^2): The printItems method has two nested loops, each running 'n' times.
//    The time complexity of nested loops is the product of their individual complexities. Here, since both loops run 'n' times, the total complexity becomes O(n^2).
//    O(1): The System.out.println(i + "" + j); is a constant time operation. However, since it's placed inside nested loops, it will execute n*n times.