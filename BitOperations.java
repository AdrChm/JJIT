// Class created to explore bit operators mentioned on page 455
public class BitOperations
{
    public static void main(String[] args)
    {
        // 0000 1111
        int A = 15;

        // 0001 1011
        int B = 27;

        System.out.println((A&B) + " = 0000 1111 & 0001 1011 = 0000 1011");
        System.out.println((A|B) + " = 0000 1111 | 0001 1011 = 0001 1111");
        System.out.println((A^B) + " = 0000 1111 ^ 0001 1011 = 0001 0100");
        System.out.println();

        int Co1A = ~A;
        System.out.println(Co1A + " = -0000 1111" + " = -(" + A + " + 1)");
        System.out.println("    =  1111 0000 = " + Integer.toBinaryString(Co1A));
        System.out.println();

        int Co1B = ~B;
        System.out.println(Co1B + " = -0001 1011 + 1" + " = -(" + B + " + 1)");
        System.out.println("    =  1110 0100 = " + Integer.toBinaryString(Co1B));
        System.out.println();

        System.out.println("LeftShift <<");

        System.out.println((A << 2) + " = 0000 1111 << 2");
        // << 2 is like A * 2 * 2
        System.out.println(A * 4 + " = 0011 1100");

        System.out.println((B << 3) + " = 0001 1011 << 3");
        // << 3 is like A * 2 * 2 * 2
        System.out.println(B * 8 + " = 1101 1000");

        // What if I move it even more?
        System.out.println((A << 30) + "\t = 0000 0000 0000 0000 0000 0000 0000 1111 << 30");
        // << 2 is like A * 2 * 2
        System.out.println(A * Math.pow(2,30) + "\t = 1100 0000 0000 0000 0000 0000 0000 0011?");
        System.out.println("\t" + Integer.toBinaryString(A << 30));
        System.out.println();

        System.out.println((B << 28) + "\t = 0000 0000 0000 0000 0000 0000 0110 0011 << 28");
        // << 3 is like A * 2 * 2 * 2
        System.out.println(B * Math.pow(2,28) + "\t = 1011 0000 0000 0000 0000 0000 0000 0001? ");
        System.out.println("\t" + Integer.toBinaryString(B << 28));
        System.out.println();

        System.out.println("RightShift >>");

        System.out.println((A >> 2) + " = 0000 1111 >> 2");
        // << 2 is like A * 2 * 2
        System.out.println(Integer.toBinaryString(A >> 2) + " = 1100 0011");

        System.out.println((B >> 3) + " = 0001 1011 >> 3");
        // << 3 is like A * 2 * 2 * 2
        System.out.println(Integer.toBinaryString(B >> 3) + " = 0110 0011");

        // What if I move it even more?
        System.out.println((A >> 30) + "\t = 0000 0000 0000 0000 0000 0000 0000 1111 >> 30");
        // << 2 is like A * 2 * 2
        System.out.println("\t = 1100 0000 0000 0000 0000 0000 0011 1100?");
        System.out.println("\t" + Integer.toBinaryString(A >> 30));
        System.out.println();

        System.out.println((B >> 28) + "\t = 0000 0000 0000 0000 0000 0000 0110 0011 >> 28");
        // << 3 is like A * 2 * 2 * 2
        System.out.println("\t = 1011 0000 0000 0000 0000 0000 0000 0001? ");
        System.out.println("\t" + Integer.toBinaryString(B >> 28));
        System.out.println();

        System.out.println("Looks like values over the range aren't brought back on the other side");
        System.out.println();

        System.out.println("What about RightShift >>>");
        System.out.println((A >>> 2) + " = 0000 1111 >>> 2");
        // << 2 is like A * 2 * 2
        System.out.println(Integer.toBinaryString(A >>> 2) + " = 1100 0011");

        System.out.println((B >>> 3) + " = 0001 1011 >>> 3");
        // << 3 is like A * 2 * 2 * 2
        System.out.println(Integer.toBinaryString(B >>> 3) + " = 0110 0011");

        // What if I move it even more?
        System.out.println((A >>> 30) + "\t = 0000 0000 0000 0000 0000 0000 0000 1111 >>> 30");
        // << 2 is like A * 2 * 2
        System.out.println("\t = 1100 0000 0000 0000 0000 0000 0011 1100?");
        System.out.println("\t" + Integer.toBinaryString(A >>> 30));
        System.out.println();

        System.out.println((B >>> 28) + "\t = 0000 0000 0000 0000 0000 0000 0110 0011 >>> 28");
        // << 3 is like A * 2 * 2 * 2
        System.out.println("\t = 1011 0000 0000 0000 0000 0000 0000 0001? ");
        System.out.println("\t" + Integer.toBinaryString(B >>> 28));
        System.out.println();

        System.out.println("I still have no clue how >>> differs from >> XD");
    } // main

} // class BitOperations
