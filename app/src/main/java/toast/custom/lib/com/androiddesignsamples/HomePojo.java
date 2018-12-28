package toast.custom.lib.com.androiddesignsamples;

public class HomePojo  {

    private String imageUrl,title,des;

    public HomePojo(String imageUrl, String title, String des) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.des = des;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
