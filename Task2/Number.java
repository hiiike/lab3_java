package Task2;

import Task1.MyException;

import java.io.Closeable;
import java.io.IOException;

public class Number implements Closeable{
    private int five;

    public Number(int five) {
        this.five = five;
        validate();
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public void validate() {

        if (five!=5) {
            throw new MyException("You need to input number 5");
        }
    }

    @Override
    public void close() throws IOException{
            System.out.println("closed");
    }
}
