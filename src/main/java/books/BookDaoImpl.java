package books;

import books.model.Book;
import dbconf.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDao {


    @Override
    public void insert(Book book) {

        String insertBookQuery = new StringBuilder("insert into books(")
                .append("title,")
                .append("pages_number,")
                .append("isbn,")
                .append("category_id,")
                .append("publisher_id) ")
                .append("values (?,?,?,?,?);")
                .toString();


        try (Connection connection = ConnectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertBookQuery)) {

            preparedStatement.setString(1,book.getTitle());
            preparedStatement.setInt(2,book.getPagesNumber());
            preparedStatement.setLong(3,book.getIsbn());
            preparedStatement.setInt(4,book.getCategoryId());
            preparedStatement.setInt(5,book.getPublisherId());

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> findByAuthorFullName(String fullName) {
        return null;
    }

    @Override
    public void insertMany(List<Book> books) {

    }
}
