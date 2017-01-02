package testCode;

/**
 * Created by lulu on 12/29/16.
 */
public class Counter {
    private int value;

    public int getValue(){
        return value;
    }

    public void click(){
        value = value + 1;
    }

    public void reset(){
        value = 0;
    }

    public void unlick(){
        value = value - 1;
    }
}
