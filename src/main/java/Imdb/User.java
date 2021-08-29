package Imdb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class User implements Comparable<User> {
    String name;
    String surname;
    LocalDate birthday;
    Address address;

    public User(String name, String surname, LocalDate birthday, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnameName() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String city, String street, int app) {
        address.setCity(city);
        address.setStreet(street);
        address.setApp(app);
    }

    public String getProperty(String propertyName) {
        String propertyValue = "";
        switch (propertyName) {
            case "name": {
                propertyValue = name;
                break;
            }
            case "surname": {
                propertyValue = surname;
                break;
            }
            case "birthday": {
                propertyValue = birthday.toString();
                break;
            }
        }
        return propertyValue;
    }


    public String toString() {
        return name + ":" + surname + ":" + birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ":" + address.toString();
    }

    @Override
    public int compareTo(User o) {
        return this.toString().compareTo(o.toString());
    }


    public boolean equals_search(Object o) {
        boolean retVal = false;
        if (o instanceof User) {
            User user;
            user = (User) o;
            retVal = (user.name.equalsIgnoreCase(this.name) || user.surname.equalsIgnoreCase(this.name) || user.birthday.toString().equalsIgnoreCase(this.birthday.toString()) || user.address.equals_search(this.address));
        }
        return retVal;
    }
}
