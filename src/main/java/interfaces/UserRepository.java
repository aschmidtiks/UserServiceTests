package interfaces;

import classes.User;

public interface UserRepository {
    User findById(String id);
}
