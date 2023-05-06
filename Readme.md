# Welcome to Socials - A command line Application

Console program that can simulate a social network.

Users have the following capabilities (command to be used in [ Socials ]):

[signup] -> A user can signup to the system

[login]  -> A user will be able to login to the system and the session will be created and used across for the other commands. Any existing session will be reinitiated with the new user logins.

[post]   -> A user can post a feed item.

[follow] -> Users can follow other users.

[reply]  -> A user can comment on another user's feed item.

[upvote/downvote] -> Upvote or downvote posts.

[shownewsfeed] -> Any user can read his news feed. News items are sorted based on the following (following options to sort feed by are available):

1 - Followed users: posts by followed users appear first.
2 - Score (= upvotes - downvotes): higher the better.
3 - The number of comments: higher the better.
4 - Timestamp: more recent the better.

users to comment on a comment and upvote/downvote a comment. ● Display time in language like 2m ago, 1 hr ago etc.


# Input and output

The input should be taken in the form of commands input via the command line. The statements should consist of commands and arguments. Commands can include ‘signup’, ‘newsfeed’, ‘upvote’ etc. Arguments can vary depending on the commands.
Example - reply(feed_id, reply_text)

**Commands Used in Socials App**

1.<signup> => "signup" + Space + "username" + "password"

2.<login> => "login" + Space + "username" + "password"

3.<signout> => "signout" + Space + "username" + "password"

4.<follow> => "follow" + Space "username"

5.<upvote> => "upvote" + Space + "postId"

6.<downvote> => "downvote" + Space + "postId"

7.<comment> => "comment" + Space + "postId" + Space + "Text"

8.<shownewsfeed> => "shownewsfeed" + Space + "sortingMethod"

9.<shownewsfeed> => "shownewsfeed"

For Demo Video pls Click on this GoogleDrive Link :

https://drive.google.com/file/d/1vGaefAKTQ5PJEapgB_bU5gV6CTG9KZ--/view?usp=share_link

