package org.kss;

public class UserService {
    public User getUserById(String userId) {
        return new User(userId, "user123@example.com", "Active");
    }
}

class User {
    private String id;
    private String email;
    private String status;

    public User(String id, String email, String status) {
        this.id = id;
        this.email = email;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }
}
