package Imdb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class User implements Comparable <User>{
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
        String name;
        String surname;
        LocalDate birthday;
        Address address;
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
        this.address.setCity(city);
        this.address.setStreet(street);
        this.address.setApp(app);
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
            User user = new User();
            user = (User) o;
            retVal = (user.name.toLowerCase().equals(this.name.toLowerCase()) || user.surname.toLowerCase().equals(this.name.toLowerCase()) || user.birthday.toString().toLowerCase().equals(this.birthday.toString().toLowerCase()) || user.address.equals_search(this.address));
        }
        return retVal;
    }


//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 17 * hash + this.name.hashCode();
//        hash = 17 * hash + this.surname.hashCode();
//        hash = 17 * hash + this.birthday.hashCode();
//        hash = 17 * hash + this.address.hashCode();
//        return hash;
//    }



}



//if ((user.name.contains(searchString))
//        | (user.surname.contains(searchString))
//        | (user.address.city.contains(searchString))
//        | (user.address.street.contains(searchString)) |
//        (user.address.app.toString().equals(searchString))) {
//        System.out.println(db.indexOf(user) + " " + user.toString());
//        }
//        } else {
//        if (user.birthday.equals(birthday)) System.out.println(db.indexOf(user) + " " + user.toString());