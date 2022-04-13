package collectionBasic;

public class Book implements Comparable<Book> {
    private String bookName;
    private String author;
    private long isbn;
    private double price;
    public Book(String bookName, String author, long isbn, double price) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    public Book() {
        super();
    }
    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
    //method used for sorting
    @Override
    public int compareTo(Book o) {
        //sorting on the basis of price
        if(this.price < o.price){
            return -1;
        }
        else if(this.price > o.price){
            return 1;
        }
        else {
            return 0;
        }
    }
}