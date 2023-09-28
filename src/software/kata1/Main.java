package software.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2001, 10, 11);
        Person naixin = new Person("Naixin", birthday);
        System.out.println(naixin);
    }
}
