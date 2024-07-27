import java.util.function.*;

public class SomeInterfaces {
    public static void main(String[] args) {
        int n1 = -5;
        double n2 = 5.0;
        BiConsumer<Number, Number> calculateToDouble = (i, j) -> {
            System.out.println("Calculate to double: " + (double) i.doubleValue() * j.doubleValue());
        };
        calculateToDouble.accept(n1, n2);
        BiConsumer<Number, Number> calculateHashCode = (i, j) -> {
            // System.out.println(i.hashCode());
            // System.out.println(j.hashCode());
	    	System.out.println("Calculate hash code: " + (int) i.hashCode() * j.hashCode());
        };

		BiFunction<Number, Number, String> addThenToStringBit = (i, j) -> {
			StringBuilder result = new StringBuilder();
			int sum = i.intValue() + j.intValue();
			// System.out.println("i: " + i.intValue());
			// System.out.println("Sum: " + sum);
			for (int k = 31; k >= 0; k--) {
				int mask = 1 << k;
				result.append((sum & mask) != 0 ? "1" : "0");
			}
			return result.toString();
		};
        calculateHashCode.accept(n1, n2);
		System.out.println("Sum in bit: " + addThenToStringBit.apply(n1, n2));
		Predicate<String> stringBitIsNotNegative = (s) -> {
			return s.charAt(0) != '1';
		};
		System.out.println("Sum is negative: " + stringBitIsNotNegative.test(addThenToStringBit.apply(n1, n2)));
    }
}
