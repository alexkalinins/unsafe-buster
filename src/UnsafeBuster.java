import sun.misc.Unsafe;


public class UnsafeBuster {
    public static void main(String[] args) {
        long counter = 0;
        long garbageSize = Integer.MAX_VALUE;
        Unsafe unsafe = Garbage.getUnsafe();

        while (true) {
            unsafe.allocateMemory(garbageSize);
            System.out.printf("Garbage Created: %d%n", ++counter);
        }

    }
}
