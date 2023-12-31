package zooClub;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private final String humanName;
    private Integer humanAge;

    public Person(String humanName) {
        this.humanName = humanName;
    }

    @Override
    public String toString() {
        return "Учасник " + humanName + ", віком " + humanAge + " років";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(humanName, person.humanName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanName);
    }

    public String getHumanName() {
        return humanName;
    }

    public Integer getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(Integer humanAge) {
        this.humanAge = humanAge;
    }
}
