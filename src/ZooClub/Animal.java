package ZooClub;

import java.util.Objects;

public class Animal {
    private AnimalType animalType;
    private String animalName;

    public Animal(String animalType, String animalName) {
        AnimalType[] animalTypeArray = AnimalType.values();
        for (AnimalType Type : animalTypeArray) {
            String typeString = Type.toString();
            if (animalType.equalsIgnoreCase(typeString)) {
                this.animalType = Type;
                break;
            } else {
                this.animalType = AnimalType.Other;
            }
        }
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType=" + animalType +
                ", animalName='" + animalName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getAnimalType() == animal.getAnimalType() && Objects.equals(getAnimalName(), animal.getAnimalName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnimalType(), getAnimalName());
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
