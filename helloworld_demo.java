public class HelloApp {
    public static void main(String[] args) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder greeting = new StringBuilder("Hello, ");

            for (String name : args) {
                greeting.append(name).append(", ");
            }

            String finalGreeting = greeting.substring(0, greeting.length() - 2);

            System.out.println(finalGreeting + "!");
        }
    }
}
