package software.kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;

    @Override
    public String toString() {
        return String.format("%s is %d years old. Birthday: %s", this.name, this.getAge(), this.birthday);
    }

    private int getAge() {
        return (int) ((LocalDate.now().toEpochDay() - birthday.toEpochDay()) / 365.25);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
