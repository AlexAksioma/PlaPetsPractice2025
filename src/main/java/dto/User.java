package dto;

import java.util.Arrays;
import java.util.Objects;

public class User {
//     "email": "helenjohnson112233@gmail.com",
//             "name": "Helen Johnson",
//             "avatar": "https://www.gravatar.com/avatar/0?d=mp",
//             "phone": null,
//             "roles": [
//             "User"
//             ]
    private String email;
    private String name;
    private String avatar;
    private String phone;
    private String[] roles;

    public User() {
    }

    public User(String email, String name, String avatar,
                String phone, String[] roles) {
        this.email = email;
        this.name = name;
        this.avatar = avatar;
        this.phone = phone;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(name, user.name) && Objects.equals(avatar, user.avatar) && Objects.equals(phone, user.phone) && Objects.deepEquals(roles, user.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, avatar, phone, Arrays.hashCode(roles));
    }
}
