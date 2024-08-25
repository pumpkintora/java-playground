import java.util.Iterator;

public class FibonacciGenerator implements Iterator<Integer> {
    private int previous = 0;
    private int current = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int nextValue = previous + current;
        previous = current;
        current = nextValue;
        return previous;
    }

    public static void main(String[] args) {
        FibonacciGenerator fibGen = new FibonacciGenerator();
        System.out.println(fibGen.next());
        System.out.println(fibGen.next());
        System.out.println(fibGen.next());
        System.out.println(fibGen.next());
        System.out.println(fibGen.next());
        System.out.println(fibGen.next());
    }
}
