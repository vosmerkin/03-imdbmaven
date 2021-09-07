package Imdb;

import java.time.LocalDate;
import java.util.*;


//TODO find more effective data structure
//todo interface for imdb

//todo package imdb

//todo поиск по конкретным полям


public class UsersImdb implements Imdb{

    public List<User> db = new ArrayList<>();
    public Map<String, List<User>> dbNames = new  HashMap<>();
    public Map<String, List<User>> dbSurnames = new  HashMap<>();
    public Map<String, List<User>> dbBirthdays = new  HashMap<>();


    public void addEntry(User user) {
        db.add(user);
    }

    public void searchUsersMap (Map<String, List<User>> dbMap, String searchString) {
        List <User> db = dbMap.get(searchString);
        for (User user: db) {
            System.out.println(user);
        }

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
        //todo  make search not case sensitive

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
                    System.out.println(db.indexOf(user) + " " + user);
                }
            } else {
                if (user.birthday.equals(birthday)) System.out.println(db.indexOf(user) + " " + user);
            }
    }

    public void delete(int userIndex) {
        db.remove(userIndex);
    }
}
