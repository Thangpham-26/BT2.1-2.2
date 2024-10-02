public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("ThangPham", "thangpham26@gmail.com", 'm');

        System.out.println(author1.toString());
        System.out.println("Name: " + author1.getName());
        System.out.println("Email: " + author1.getEmail());
        System.out.println("Gender: " + author1.getGender());

        author1.setEmail("thang492006@gmail.com");
        System.out.println("Updated Email: " + author1.getEmail());
    }
}