package car;

public class Car {
    private Name name;
    private PositionNumber position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new PositionNumber(position);
    }
}
