package lk.jiat.app.jersey.model;

import jakarta.enterprise.context.RequestScoped;
import lk.jiat.app.jersey.annotation.UserBind;


//@UserBind
@RequestScoped
public class User {
    private String name;
    private String email;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
