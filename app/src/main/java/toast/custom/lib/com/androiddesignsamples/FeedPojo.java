package toast.custom.lib.com.androiddesignsamples;

public class FeedPojo {

    private String userLogo,userName,feedPhoto;

    public FeedPojo(String userLogo,String userName,String feedPhoto)
    {
        this.userLogo = userLogo;
        this.userName = userName;
        this.feedPhoto = feedPhoto;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFeedPhoto() {
        return feedPhoto;
    }

    public void setFeedPhoto(String feedPhoto) {
        this.feedPhoto = feedPhoto;
    }
}
