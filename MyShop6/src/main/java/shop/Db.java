package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Db {

    public static List<Post> postsList = new ArrayList<>();

    public static List<User> usersList = new ArrayList<>();

    public static Post getPostById(int postId) {
        for (Post post : Db.postsList) {
            if (post.getPostId() == postId) {
                return post;
            }

        }
        return null;

    }

}
