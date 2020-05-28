package sdominika.ndtcertification.interfaces;


import sdominika.ndtcertification.entity.User;

public interface UserService {
    User findByUserName(String name);
    void saveUser(User user);
}
