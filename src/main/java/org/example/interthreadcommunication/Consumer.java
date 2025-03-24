package org.example.interthreadcommunication;

public class Consumer implements Runnable {

    Data data;

    public Consumer(Data data) {
        this.data = data;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    @Override
    public void run() {
        while(true){
             data.getNum();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
