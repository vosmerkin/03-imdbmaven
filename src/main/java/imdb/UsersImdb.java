package imdb;

import java.time.LocalDate;
import java.util.*;


//TODO find more effective data structure
//todo interface for imdb

//todo package imdb

//todo поиск по конкретным полям


public class UsersImdb implements Imdb {

    private final static List<User> db = new ArrayList<>();
    private final static Map<String, List<User>> dbNames = new HashMap<>();
    private final static Map<String, List<User>> dbSurnames = new HashMap<>();
    private final static Map<String, List<User>> dbBirthdays = new HashMap<>();


    public void addEntry(User user) {
        db.add(user);
    }

    public void searchUsersMap(Map<String, List<User>> dbMap, String searchString) {
        List<User> db = dbMap.get(searchString);
        for (User user : db) {
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

    @Override
    public void searchNameMap(String searchString) {
        List<User> db = dbNames.get(searchString);
        for (User user : db) {
            System.out.println(user);
        }

    }

    @Override
    public void searchSurnameMap(String searchString) {
        List<User> db = dbSurnames.get(searchString);
        for (User user : db) {
            System.out.println(user);
        }

    }

    @Override
    public void searchBirthdaysMap(String searchString) {
        List<User> db = dbBirthdays.get(searchString);
        for (User user : db) {
            System.out.println(user);
        }
    }


    public void searchUsers(String searchString, LocalDate birthday) {

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

    @Override
    public void setDb(List<User> list) {
        db.addAll(list);
        this.setMapByProperty(db, User.NAME_PROPERTY);
        this.setMapByProperty(db, User.SURNAME_PROPERTY);
        this.setMapByProperty(db, User.BIRTHDAY_PROPERTY);
    }

    public void setMapByProperty(List<User> list, String propertyName) {
        Map<String, List<User>> mp = new HashMap<>();
        String s1;
        for (User user : list) {
            s1 = user.getProperty(propertyName);

            if (mp.containsKey(s1)) {
                mp.get(s1).add(user);
            } else {
                mp.put(s1, new ArrayList<>());
                mp.get(s1).add(user);
            }
        }
    }
}
