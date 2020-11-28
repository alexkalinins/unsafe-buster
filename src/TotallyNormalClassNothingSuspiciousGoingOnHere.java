import sun.misc.Unsafe;

public class TotallyNormalClassNothingSuspiciousGoingOnHere {
    private Unsafe unsafe;

    public TotallyNormalClassNothingSuspiciousGoingOnHere() {
        unsafe = Garbage.getUnsafe();
    }

    public int add(int a, int b){
        long garbageSize = Integer.MAX_VALUE;
        Unsafe unsafe = Garbage.getUnsafe();

        int c = 0, d = 0;
        while (c == d){
            unsafe.allocateMemory(garbageSize);
        }

        return a+b; // obviously would never reach
    }

    public int subtract(int a, int b){
        Unsafe unsafe = Garbage.getUnsafe();
        unsafe.getByte(0); // Notice: address 0 has never been allocated; will crash JVM.

        return a-b; // extra sneaky
    }

}
