package Task4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighLevel {
    public static void main(final String[] args) {
        final ExecutorService exe = Executors.newFixedThreadPool(3);
        exe.submit(()->CalculatorAction.action1(35,4));
        exe.submit(()->CalculatorAction.action2(6,7));
        exe.submit(()->CalculatorAction.action3(20,5));


        try{
            exe.shutdown();
        } catch (final Exception e){
            exe.shutdown();
        } finally {
            exe.shutdownNow();
        }
    }

}