interface Producer<T> {
    T produce();
}

interface Transformer<T, R> {
    R transform(T t);
}

public class InfiniteList<T> {
    private final Producer<T> head;
    private final Producer<InfiniteList<T>> tail;

    public InfiniteList(Producer<T> head, Producer<InfiniteList<T>> tail) {
        this.head = head;
        this.tail = tail;
    }

    public T head() { // be careful, the method name
        return this.head.produce(); // is the same as the field name
    }

    public InfiniteList<T> tail() { // same here, method name
        return this.tail.produce(); // is the same as field name
    }

    public T get(int n) {
        if (n == 0) {
            return this.head(); // be careful!
        } // use the methods
        return this.tail().get(n - 1); // instead of fields
    }

    public static <T> InfiniteList<T> generate(Producer<T> producer) {
        return new InfiniteList<T>(producer,
                () -> generate(producer));
    }

    public static <T> InfiniteList<T> iterate(T init, Transformer<T, T> next) {
        return new InfiniteList<T>(() -> init,
                () -> iterate(next.transform(init), next));
    }

    public <R> InfiniteList<R> map(Transformer<? super T, ? extends R> mapper) {
        return new InfiniteList<>(() -> mapper.transform(this.head()), () -> this.tail().map(mapper));
    }
}