import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * A class that uses sun.misc.Unsafe to allocate memory out side of java heap.
 * This allocated memory is literally garbage because nothing can be done with it.
 */
public class Garbage {
    private Unsafe unsafe;
    private long address;

    public Garbage(long size) {
        this.unsafe = getUnsafe();
        this.address = unsafe.allocateMemory(size);
    }

    /**
     * Uses reflection to get Unsafe instance.
     * @return Unsafe instance.
     */
    private static Unsafe getUnsafe() {
        Unsafe unsafe = null;
        try{
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe= (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unsafe;
    }

    /**
     * Address getter
     * @return the address of this garbage object.
     */
    public long getAddress() {
        return address;
    }
}
