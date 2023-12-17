package BigO;

public class ConstantTime {

    // This function takes an integer n as input and performs a single operation
    // regardless of the value of n.
    public static void constantTimeOperation(int n) {
        System.out.println("This is a constant time operation.");
    }

    public static void main(String[] args) {
        int n = 10; // Input value doesn't affect the operation's runtime.
        constantTimeOperation(n);
    }
}
