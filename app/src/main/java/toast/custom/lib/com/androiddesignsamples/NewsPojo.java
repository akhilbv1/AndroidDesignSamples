package toast.custom.lib.com.androiddesignsamples;

public class NewsPojo {

    private String newsLogo,newsTitle,newsDes;

    public NewsPojo(String newsLogo,String newsTitle,String newsDes)
    {
        this.newsDes = newsDes;
        this.newsLogo = newsLogo;
        this.newsTitle = newsTitle;
    }

    public String getNewsLogo() {
        return newsLogo;
    }

    public void setNewsLogo(String newsLogo) {
        this.newsLogo = newsLogo;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDes() {
        return newsDes;
    }

    public void setNewsDes(String newsDes) {
        this.newsDes = newsDes;
    }
}
