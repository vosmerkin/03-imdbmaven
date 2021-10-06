package imdb;

import java.time.LocalDate;
import java.util.List;

public interface Imdb {
//    List<User> db = null;
//    Map<String, List<User>> namesDb =null;
//    Map<String, List<User>> surnamesDb =null;
//    Map<String, List<User>> birthdayDb =null;

    void addEntry(User user);


    void searchUsersStream(User searchedUser);

    void searchNameMap(String searchString);

    void searchSurnameMap(String searchString);

    void searchBirthdaysMap(String searchString);

    void searchUsers(String searchString, LocalDate birthday);

    void delete(int userIndex);

    void setDb(List<User> list);


}
