public class Book extends Item
{
    private long isbn_number;
    private String author;

    public Book()
    {
        this.isbn_number = 0;
        this.author = "";
    }

    public Book(String title, long isbn_number, String author) {
        super(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }

    @Override
    public String getListing() {
        String output  = "Book Name - " + getTitle() + "\n" +
                            "Author - " + author + "\n" +
                            "ISBN # - " + isbn_number;

        return output;

    }

    public long getIsbn_number()
    {
        return isbn_number;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setIsbn_number(long number)
    {
        isbn_number = number;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

}
