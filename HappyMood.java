package ca.ualberta.cs.lonelytwitter;

public class HappyMood extends CurrentMood {
    public void setMessage(String message){
        message = "happy";
    }
    public String getMessage(){
        return message;


    }
}
