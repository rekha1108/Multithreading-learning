package org.example.interthreadcommunication;

public class Producer implements Runnable {

    Data data;

    public Producer(Data data) {
        this.data = data;
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i =0;
        while(true){
            data.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
