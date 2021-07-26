package Imdb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//TODO find more effective data structure
//todo interface for imdb

//todo package imdb
//todo поиск по конкретным полям


public class Imdb {
    public List<User> db = new ArrayList<User>();


    public void addEntry(User user) {
        db.add(user);
    }

    public void searchUsers(String searchString, LocalDate birthday) {

//        int app;
//
//        try {
//            app = Integer.parseInt(searchString);
//        } catch (NumberFormatException nfe) {
//            app = 0;
//        }
//        Collections.sort(db);
//        int index =0;
//
//        index = Collections.binarySearch(db, new Imdb.User(searchString, searchString, birthday, new Imdb.Imdb.Address(searchString, searchString, app)));


        for (User user : db)
            if ( !searchString.equals("")) {
                if ((user.name.contains(searchString))
                        | (user.surname.contains(searchString))
                        | (user.address.city.contains(searchString))
                        | (user.address.street.contains(searchString)) |
                        (user.address.app.toString().equals(searchString))) {
                    System.out.println(db.indexOf(user) + " " + user.toString());
                }
            } else {
                if (user.birthday.equals(birthday)) System.out.println(db.indexOf(user) + " " + user.toString());
            }


    }

    public void delete(int userIndex) {

        db.remove(userIndex);

    }
}
