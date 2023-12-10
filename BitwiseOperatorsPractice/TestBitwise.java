package BitwiseOperatorsPractice;

// As per https://www.youtube.com/watch?v=bBZ4lIBB_X4&ab_channel=ClayDeskE-Learning
public class TestBitwise {
    public static void main(String[] args) {
        // Define three integer variables: a, b, and c.
        int a = 60; // Binary representation: 00111100
        int b = 13; // Binary representation: 00001101
        int c = 0;  // This variable will store the results of bitwise operations.

        // Perform a bitwise AND operation between 'a' and 'b' and store the result in 'c'.
        c = a & b; // Bitwise AND: 00111100 & 00001101 = 00001100
        System.out.println("a & b = " + c);

        // Perform a bitwise OR operation between 'a' and 'b' and store the result in 'c'.
        c = a | b; // Bitwise OR: 00111100 | 00001101 = 00111101
        System.out.println("a | b = " + c);

        // Perform a bitwise XOR (exclusive OR) operation between 'a' and 'b' and store the result in 'c'.
        c = a ^ b; // Bitwise XOR: 00111100 ^ 00001101 = 00110001
        System.out.println("a ^ b = " + c);

        // Perform a bitwise NOT operation on 'a' and store the result in 'c'.
        c = ~a;    // Bitwise NOT: ~00111100 = 11000011
        System.out.println("~a = " + c);

        // Shift the bits of 'a' to the left by 2 positions and store the result in 'c'.
        c = a << 2; // Left shift by 2: 00111100 << 2 = 11110000
        System.out.println("a << 2 = " + c);

        // Shift the bits of 'a' to the right by 2 positions and store the result in 'c'.
        c = a >> 2; // Right shift by 2: 00111100 >> 2 = 00001111
        System.out.println("a >> 2 = " + c);

        /*

        Real world applications for bitwise operators...

        Low-Level Hardware Programming: Bitwise operations are often used in low-level hardware programming, such as programming microcontrollers and embedded systems. They are used to configure and control hardware components by setting or clearing specific bits in hardware registers.

        Graphics and Image Processing: Bitwise operations can be used to manipulate individual pixels in images. For example, you can use bitwise AND to mask out specific color components, or XOR to create interesting visual effects like image encryption or screen transitions.

        Data Compression: Bit manipulation is fundamental in data compression algorithms like Huffman coding and Run-Length Encoding (RLE). These algorithms use bitwise operations to encode and decode data more efficiently.

        Network Protocols: Bitwise operations are used in network protocols for tasks like packet parsing and handling flags and options within packets. For example, the Internet Protocol (IP) uses bitwise operations to extract information from the header.

        Security and Cryptography: Bitwise operations are crucial in cryptographic algorithms. They are used for tasks like generating cryptographic keys, performing bitwise substitution in cryptographic ciphers, and implementing cryptographic hash functions.

        File Systems: File systems often use bitwise operations to manage file permissions and attributes. Each file or directory may have a set of permission bits that can be modified using bitwise operations.

        Game Development: In game development, bitwise operations can be used for managing game states, defining collision masks, or implementing complex game logic involving various flags and conditions.

        Database Systems: In database systems, bitwise operations can be used for managing permissions, storing and retrieving data in a compact binary format, and implementing efficient indexing structures.

        Boolean Flags and Options: In general software development, bitwise operations are used for managing boolean flags and options compactly. For example, using a set of bitwise flags to represent different options in a configuration.

        Memory Optimization: Bitwise operations can be used to optimize memory usage. For example, when dealing with large data structures, you can pack multiple values into a single integer using bitwise operations to save memory.

        */
    }
}
