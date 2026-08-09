public class Book 
{ 
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println();

    }
    
    Public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkein", 320);
        Book b3 = new Book("Cinderella", "Charles Perrault", 120);
        Book b4 = new Book("Harry Potter", "J.K. Rowling", 280);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
