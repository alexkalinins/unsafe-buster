import java.util.ArrayList;
import java.util.List;

public class UnsafeBuster {
    public static void main(String[] args) {
        List<Garbage> garbageList = new ArrayList<>();
        long garbageSize = Integer.MAX_VALUE;

        while(true){
            Garbage garbage = null;
            try {
                garbage = new Garbage(garbageSize);
            } catch (OutOfMemoryError e){
                System.out.printf("Out of Memory! Total garbage: %d%n", garbageList.size());
                System.exit(1);
            }
            garbageList.add(garbage);
            System.out.printf("%d is the address of new garbage. %n", garbage.getAddress());
        }
    }
}
