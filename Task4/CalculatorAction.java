package Task4;

import Task1.MyException;

public class CalculatorAction {
    public static void action1(final double a, final double b){
        System.out.println("action1");
        System.out.println(a+b + " action1");
    }

    public static void action2(final double a, final double b){
        System.out.println("action2");
        System.out.println(a-b + " action2");
    }

    public static void action3(final double a, final double b){
        System.out.println("action3");
        System.out.println(a*b + " action3");
    }

}
