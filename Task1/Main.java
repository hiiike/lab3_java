package Task1;

public class Main {
    public static void main(final String[] args) {
        try {
            final User user1 = new User("155", "Koval", 30, null, "null");
        } catch (MyException e) {
            System.out.println(e.getMessages()+", "+e.getErrorCode());
        }
    }
}
