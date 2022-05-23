package Task4;

public class LowLevel {
        public static void main(final String[] args) {

            final SimpleThread1 simpleThread1 = new SimpleThread1();
            final SimpleThread2 simpleThread2 = new SimpleThread2();
            final SimpleThread3 simpleThread3 = new SimpleThread3();

            simpleThread1.start();
            simpleThread2.start();
            simpleThread3.start();

        }
        public static class SimpleThread1 extends Thread{
            @Override
            public void run() {
                CalculatorAction.action1(15,3);
            }
        }
        public static class SimpleThread2 extends Thread{
            @Override
            public void run() {
                CalculatorAction.action2(16,9);
            }
        }
        public static class SimpleThread3 extends Thread{
            @Override
            public void run() {
                CalculatorAction.action3(12,5);
            }
        }

    }

