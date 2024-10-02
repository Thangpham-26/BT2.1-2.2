public class Book {
    private String name;
    private Author[] authors; // Mảng các đối tượng Author
    private double price;
    private int qty = 0; // Mặc định là 0 nếu không truyền vào

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (Author author : authors) {
            authorsStr.append(author.toString()).append(",");
        }
        if (authorsStr.length() > 0) {
            authorsStr.setLength(authorsStr.length() - 1);
        }
        return "Book[name=" + name + ",authors={" + authorsStr.toString() + "},price=" + price + ",qty=" + qty + "]";
    }
}
