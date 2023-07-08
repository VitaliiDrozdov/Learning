package ZooClub;

import java.util.Objects;

public class Person {
    private String humanName;
    private Integer age;

    public Person(String name, Integer age) {
        this.humanName = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "humanName='" + humanName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getHumanName(), person.getHumanName()) && Objects.equals(getAge(), person.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHumanName(), getAge());
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
