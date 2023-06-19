// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EBook ebook = new EBook("The Power of Habit", "CHARLES DUHIGG", 50.00, 1, ".pdf");
        PhysicalBook physicalBook = new PhysicalBook("The Power of Habit", "CHARLES DUHIGG", 60.00, 3, 750);

        // Testing EBook methods
        String bookName = ebook.getTitle();
        double bookPrice = ebook.getPrice();
        String bookAuthor = ebook.getAuthor();
        int bookQuantity = ebook.getQuantity();
        String format = ebook.getFileFormat();

        System.out.println("Title: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("File Type: " + format);
        System.out.println("Quantity: " + bookQuantity);
        System.out.println("Price: RM" + bookPrice);
        System.out.println("");


        ebook.openBook();
        ebook.downloadBook();
        boolean isValidFormat = ebook.validateFormat();
        System.out.println("Is the file format valid? <<" + isValidFormat + ">>");

        // Testing PhysicalBook methods
        double shippingCost = physicalBook.calculateShippingCost();
        double weightInPounds = physicalBook.getWeightInPounds();
        System.out.println("Shipping cost: RM" + shippingCost);
        System.out.println("Weight in pounds: " + weightInPounds + " lbs");
    }
}