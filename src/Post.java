package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static int nextId = 1;
    private int id;
    private User author;
    private String text;
    private String link;
    private Date timestamp;
    private int score;
    private List<Comment> comments = new ArrayList<>();

    public Post(User author, String text, String link2) {
        this.id = nextId++;
        this.author = author;

        this.link = link2;

        this.text = text;
        this.timestamp = new Date();
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getScore() {
        return score;
    }

    public void upvote() {
        score++;
    }

    public void downvote() {
        score--;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public int getCommentCount() {
        return comments.size();
    }

    public void print_comment(Post post) {
        if (post.comments.size() == 0)
            System.out.println("No comments found");
        else {
            for (Comment comment : post.getComments()) {
                System.out.println(comment.getUserName() + " replied: " + comment.getComment());
            }
        }
    }

}