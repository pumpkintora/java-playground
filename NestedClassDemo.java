class A {
    private class B {
        public void buz() {
            System.out.println("Buz method in B");
        }
    }

    B foo() {
        return new B();
    }

    public void useB(B b) {
        b.buz(); // Calls the buz method on B
    }
}


public class NestedClassDemo {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.foo(); // This line will not compile as A.B is private

        // Instead, use methods provided by A to interact with B
        A a = new A();
        A.B bInstance = a.foo(); // This line also won't compile
        a.useB(bInstance); // Invalid
    }
}
