package PRACTICAL;

public class Motor implements Vehicle{
    String name;

    @Override
    public float moveMax() {
        return 150;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
