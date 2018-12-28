package toast.custom.lib.com.androiddesignsamples;

public class EventsPojo {

    private String eventTitle,eventLogo,eventDes;

    public EventsPojo(String eventLogo,String eventTitle,String eventDes)
    {
        this.eventDes = eventDes;
        this.eventLogo = eventLogo;
        this.eventTitle = eventTitle;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventLogo() {
        return eventLogo;
    }

    public void setEventLogo(String eventLogo) {
        this.eventLogo = eventLogo;
    }

    public String getEventDes() {
        return eventDes;
    }

    public void setEventDes(String eventDes) {
        this.eventDes = eventDes;
    }
}
