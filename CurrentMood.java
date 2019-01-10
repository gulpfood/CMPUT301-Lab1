package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood {
    Date date;
    String message;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
