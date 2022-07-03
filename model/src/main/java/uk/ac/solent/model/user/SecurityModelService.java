package uk.ac.solent.model.user;

public interface SecurityModelService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
