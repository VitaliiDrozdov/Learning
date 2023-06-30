package Set;

import java.util.Objects;

public class Tire implements Comparable<Tire> {
    private String model;

    private Integer price;

    public Tire(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tire{" + "model='" + model + '\'' + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Tire t) {
        return this.model.compareTo(t.model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tire tire)) return false;
        return Objects.equals(getModel(), tire.getModel()) && Objects.equals(getPrice(), tire.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getPrice());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
