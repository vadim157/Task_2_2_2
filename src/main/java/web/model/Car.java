package web.model;

public class Car {

    private String make;
    private String model;
    private int hoursePower;

    public Car(String make, String model, int hoursePower) {
        this.make = make;
        this.model = model;
        this.hoursePower = hoursePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", hoursePower=" + hoursePower +
                '}';
    }
}
