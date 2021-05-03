package car;

public class Car {
    private Name name;
    private PositionNumber position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new PositionNumber(position);
    }

    public void insertRandomNumber(int position) {
        this.position.checkIncreasePosition(position);
    }

    public String getName() {
        return this.name.getName();
    }

    public String printCarInfo() {
        return getName() + ": " + position.changePositionNumberToHyphen().toString();
    }
}
