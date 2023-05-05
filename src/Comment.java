package src;

public class Comment {

   private String text;
   private User user;

   public Comment(User user, String text) {

      this.user = user;
      this.text = text;

   }

   public String getComment() {
      return text;
   }

   public String getUserName() {
      return user.getUsername();

   }

}
