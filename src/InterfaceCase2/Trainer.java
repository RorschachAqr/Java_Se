package InterfaceCase2;

public abstract class Trainer extends Person{
    public Trainer() {
    }

    public Trainer(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
