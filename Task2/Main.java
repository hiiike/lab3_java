package Task2;

public class Main {
    public static void main(final String[] args) {
        try (final Number five = new Number(6)) {
            System.out.println(five.getFive());
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
