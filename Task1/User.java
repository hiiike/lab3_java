package Task1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String secondName;
    private int age;
    private Adress adress;
    private String email;

    public User(String firstName, String secondName, int age, Adress adress, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.adress = adress;
        this.email = email;
        validate();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void validate() {
        final List<String> list = new ArrayList<>();

        if (firstName.matches(".*\\d+.*") || firstName.matches(".*\\s+.*") || !firstName.matches(".+")) {
            list.add("first name is not correct");
        }
        if (secondName.matches(".*\\d+.*") || secondName.matches(".*\\s+.*") || !secondName.matches(".+")) {
            list.add("second name is not correct");
        }
        if (age <= 0) {
            list.add("Your age is not correct");
        }

        if (adress == null) {
            list.add("Your adress is empty");
        }
        if (email == null) {
            list.add("Your email is not correct");
        }

        if (!list.isEmpty()) {
            throw new MyException(list, ErrorCode.ERROR_400);
        }
    }
}

