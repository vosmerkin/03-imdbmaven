package imdb;

import java.time.LocalDate;

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
