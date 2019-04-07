//package pl.sda.mini_project;
//
//import .books.Book;
//import .books.BookType;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BooksManager {
//
//    public List<main.java.pl.sda.mini_project.books.Book> findBooks() {
//        return new ArrayList<>();
//    }
//
//
//    public void addBook(String author, String title, main.java.pl.sda.mini_project.books.BookType type) {
//    }
//
//    public boolean deleteBook(int bookId) {
//        return false;
//    }
//
//    public List<main.java.pl.sda.mini_project.books.Book> getSortedByAuthor() {
//        return null;
//    }
//
//    public List<Book> getSortedByType() {
//        return null;
//    }
//
//    private List<Book> createBooks() {
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("Henryk Sienkiewicz", "Ogniem i mieczem", BookType.HISTORICAL));
//        books.add(new Book("Juliusz Słowacki", "Balladyna", BookType.DRAMA));
//        books.add(new Book("Agatha Cristie", "Morderstwo w Orient Expressie", BookType.DETECTIVE_STORY));
//        books.add(new Book("Agatha Cristie", "Śmierć na Nilu", BookType.DETECTIVE_STORY));
//        books.add(new Book("Juliusz Słowacki", "Oda do wolności", BookType.POETRY));
//        books.add(new Book("Henryk Sienkiewicz", "Quo vadis", BookType.HISTORICAL));
//        books.add(new Book("Norman Davies", "Boże igrzysko. Historia Polski", BookType.HISTORICAL));
//
//        return books;
//    }
//}