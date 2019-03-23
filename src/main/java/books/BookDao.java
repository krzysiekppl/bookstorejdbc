package books;

import books.model.Book;

import java.util.List;

public interface BookDao {

    void insert(Book book);
    void delete(int id);
    void update(Book book);
    List<Book> findAll();
    List<Book> findByTitle(String title);
    List<Book> findByAuthorFullName(String fullName);
    void insertMany(List<Book> books);

}
