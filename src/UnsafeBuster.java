import sun.misc.Unsafe;


public class UnsafeBuster {
    public static void main(String[] args) {
        TotallyNormalClassNothingSuspiciousGoingOnHere myClass = new TotallyNormalClassNothingSuspiciousGoingOnHere();

        try{
            myClass.add(1,1);
            //myClass.subtract(1,1);
        } catch (Throwable e){
            System.out.println("Nice Try! (haha), caught a " + e.toString());
        } finally {
            System.out.println("If you can read this, then JVM survived!");
            System.out.println(            Garbage.getUnsafe().pageSize());
        }

    }
}
