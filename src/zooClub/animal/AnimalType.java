package zooClub.animal;

public enum AnimalType {
    Cat(1),
    Dog(2),
    Degu(3),
    Turtle(4),
    Parrot(5),
    Fish(6),
    Other(7);

    private final Integer animalCode;

    AnimalType(Integer animalCode) {
        this.animalCode = animalCode;
    }

    public Integer getAnimalCode() {
        return animalCode;
    }
}
