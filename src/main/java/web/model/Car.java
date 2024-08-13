package web.model;

public class Car {
    private String model;
    private String color;
    private int engine;

    public Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + engine +
                '}';
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int count) {
        this.engine = count;
    }
}