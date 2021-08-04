package Imdb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;


//TODO find more effective data structure
//todo interface for imdb

//todo package imdb
//todo поиск по конкретным полям


public class Imdb {
    public List<User> db = new ArrayList<User>();


    public void addEntry(User user) {
        db.add(user);
    }


    public void searchUsersStream(User searchedUser) {
        User searchResults = db.stream()
                .filter(user -> searchedUser.equals_search(user))
                .findAny()
                .orElse(null);
        System.out.println("Searched user:");
        System.out.println(searchedUser);
        System.out.println("Search result:");
        System.out.println(searchResults);

    }

    public void searchUsers(String searchString, LocalDate birthday) {
        //todo make search not case sensitive

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
        //       index = Collections.binarySearch(db, new Imdb.User(searchString, searchString, birthday, new Imdb.Imdb.Address(searchString, searchString, app)));


        for (User user : db)
            if (!searchString.equals("")) {
                if ((user.name.contains(searchString))
                        || (user.surname.contains(searchString))
                        || (user.address.city.contains(searchString))
                        || (user.address.street.contains(searchString))
                        || (user.address.app.toString().equals(searchString))) {
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
