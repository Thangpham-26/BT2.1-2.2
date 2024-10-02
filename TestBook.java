public class TestBook {
    public static void main(String[] args) {

        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com", 'f');
        Author author2 = new Author("John Tiffany", "jtiffany@example.com", 'm');
        Author author3 = new Author("Jack Thorne", "jthorne@example.com", 'm');

        Author[] authors = {author1, author2, author3};

        Book book1 = new Book("Harry Potter and the Cursed Child", authors, 39.99);
        Book book2 = new Book("Harry Potter and the Cursed Child", authors, 39.99, 200);

        System.out.println(book1);

        System.out.println(book2);

        book1.setPrice(45.99);
        System.out.println("After changing price: " + book1);

        book2.setQty(250);
        System.out.println("After changing qty: " + book2);

        System.out.println("Book name: " + book1.getName());
        System.out.println("First author: " + book1.getAuthors()[0].getName());
        System.out.println("Book price: " + book1.getPrice());
        System.out.println("Book qty: " + book1.getQty());
    }
}
