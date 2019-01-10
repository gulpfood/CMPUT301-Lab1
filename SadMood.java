package ca.ualberta.cs.lonelytwitter;

public class SadMood extends CurrentMood {
    public void setMessage(String message){
        message = "sad";
    }
    public String getMessage(){
        return message;


    }
}
