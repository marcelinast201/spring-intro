package com.example;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Component;
@Component("messageService2")
public class RandomTextMessageService implements MessageService {
    ArrayList<String> listOfMessages = new ArrayList<>();

    public RandomTextMessageService() {
        this.listOfMessages.add("hello 1");
        this.listOfMessages.add("hello 2");
        this.listOfMessages.add("hello 3");
        this.listOfMessages.add("hello 4");
        this.listOfMessages.add("hello 5");
        this.listOfMessages.add("hello 6");
        this.listOfMessages.add("hello 7");
        this.listOfMessages.add("hello 8");
        this.listOfMessages.add("hello 9");
        this.listOfMessages.add("hello 10");

    }

    @Override
    public String getMessage() {
        Random random= new Random();

        return listOfMessages.get(random.nextInt(listOfMessages.size())) ;
    }
}
