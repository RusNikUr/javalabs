package task1;
public class Main {
    public static void main(String[] args) {
        // --- Имена ---
        Name cleopatra = new Name(null, "Клеопатра", null);
        Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovsky = new Name("Маяковский", "Владимир", null);

        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovsky);

        System.out.println();

        // --- Дома ---
        House h1 = new House(1);
        House h5 = new House(5);
        House h23 = new House(23);

        System.out.println(h1);
        System.out.println(h5);
        System.out.println(h23);
    }
}