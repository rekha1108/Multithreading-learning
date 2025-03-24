package org.example;


import org.example.interthreadcommunication.Consumer;
import org.example.interthreadcommunication.Data;
import org.example.interthreadcommunication.Producer;

public class InterThread {
    public static void main(String[] args) {
        Data data = new Data();
        new Producer(data);
        new Consumer(data);

    }
}