package Imdb;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface Imdb {
//    List<User> db = null;
//    Map<String, List<User>> namesDb =null;
//    Map<String, List<User>> surnamesDb =null;
//    Map<String, List<User>> birthdayDb =null;

    void addEntry(User user);

    void searchUsersStream(User searchedUser);

    void searchUsers(String searchString, LocalDate birthday);

    void delete(int userIndex);


}
