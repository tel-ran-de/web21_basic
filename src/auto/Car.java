package auto;

import java.util.Objects;

public class Car {
    private String number;
    private String model;

    public Car(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


    public boolean equals(Car o) {
        if (this == o) return true;
        if (o == null) return false;
        return Objects.equals(number, o.number) && Objects.equals(model, o.model);
    }

}
