public class SuperCar extends Car{
    private int speed;

    public SuperCar(String model, int price, int speed) {
        super(model, price);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "model=" + getModel() +
                " price=" + getPrice() +
                " speed=" + speed +
                '}';
    }
}
