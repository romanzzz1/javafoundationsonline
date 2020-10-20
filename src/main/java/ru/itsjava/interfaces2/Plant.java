package ru.itsjava.interfaces2;

public class Plant implements Talkable, Eatable{
    @Override
    public void talk(){
        System.out.println("Я растение, я не разговариваю!");
    }
    @Override
    public void eat(){
        System.out.println("Я пью водичку, поливай меня!");
    }
}
