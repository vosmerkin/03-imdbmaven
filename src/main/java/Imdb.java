
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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
//        index = Collections.binarySearch(db, new User(searchString, searchString, birthday, new Address(searchString, searchString, app)));


        for (User user : db)
            if (searchString != "") {


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

        // return searchResults;
    }

    public void delete(int userIndex) {

        db.remove(userIndex);

    }
}
