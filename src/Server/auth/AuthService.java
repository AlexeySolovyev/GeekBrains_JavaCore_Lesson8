package Server.auth;

import Server.User;

public interface AuthService {

    boolean authUser(User user);
}
