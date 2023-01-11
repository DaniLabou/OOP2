public class Book {
    String autor = "Jules Verne";

    String title = "Ocolul pamantului in 80 de zile";

    double price = 50.00;

    public double getPrice() {
        return price;
    }

    public String showAutorAndTitle() {
        return ("Book "+title +" is writen by "+autor);
    }

    public static void showIloveBooks() {
        System.out.println("I Love Books");
    }

}