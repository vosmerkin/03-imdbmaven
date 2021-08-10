package Imdb;

import java.time.LocalDate;
import java.util.List;

public interface Imdb {
    List<User> db = null;

    void addEntry(User user);

    void searchUsersStream(User searchedUser);

    void searchUsers(String searchString, LocalDate birthday);

    void delete(int userIndex);


}
