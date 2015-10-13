package apps.freetime.evention;

import android.media.Image;


public class Event {
    int priority = 0;
    String description = "";
    Image flyer;

    public Event(Image img, int rank, String desc){
        this.description = desc;
        this.flyer = img;
        this.priority = rank;

    }

    /********************************************************************************************
     ****************************** Getters and setters******************************************
     ********************************************************************************************/


    public Image getFlyer() {
        return flyer;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFlyer(Image flyer) {
        this.flyer = flyer;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
