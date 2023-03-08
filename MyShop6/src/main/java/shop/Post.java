package shop;


public class Post {

    public String title;
    public String imgUrl;
    private final int postId;

    private final int userId;


    public Post(int userId, String title, String imgUrl) {
        this.userId = userId;
        this.title = title;
        this.imgUrl = imgUrl;
        this.postId = ((int) (title.hashCode() * Math.random()));

    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }


}
