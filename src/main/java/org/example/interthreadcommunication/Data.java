package org.example.interthreadcommunication;

public class Data {

    private int num;
    private boolean valueSet = false;

    public synchronized void getNum() {
        while(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get " + num);
        valueSet = false;
        notify();
    }

    public synchronized void setNum(int num) {
        while(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Set " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

}
