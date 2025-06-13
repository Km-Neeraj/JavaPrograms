class A {
    A get() {
        return this;
    }
}

class B extends A {
    B get() {
        return this;
    }
}

public class Ps3 {
    public static void main(String[] abc) {
        B ob = new B();
        System.out.println(ob.get() instanceof B);
    }
}
