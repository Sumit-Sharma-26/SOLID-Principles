public class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

public class Sparrow extends Bird {
    // Sparrow specific implementation
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
