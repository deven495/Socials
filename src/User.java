package src;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<User> followedUsers = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public List<User> getFollowedUsers() {
        return followedUsers;
    }

    public void follow(User user) {
        if (followedUsers.contains(user)) {
            System.out.println("You are already following " + user.getUsername());
            return;
        } else {
            followedUsers.add(user);
            System.out.println("You are now following " + user.getUsername());
        }

    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

}