package books;

import books.model.Book;
import dbconf.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setInt(2, book.getPagesNumber());
            preparedStatement.setLong(3, book.getIsbn());
            preparedStatement.setInt(4, book.getCategoryId());
            preparedStatement.setInt(5, book.getPublisherId());

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String deleteQuery = "delete from books where id = ? ";

        try (Connection connection = ConnectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        String selectQuery = "select * from books where title = ?";
        List<Book> books = new ArrayList<>();
        try (Connection connection = ConnectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, title);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setPublisherId((resultSet.getInt("publisher_id")));
                book.setCategoryId((resultSet.getInt("category_id")));
                book.setIsbn(resultSet.getLong("isbn"));
                book.setTitle(resultSet.getString("title"));
                book.setPagesNumber(resultSet.getInt("pages_number"));
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> findByAuthorFullName(String fullName) {
        return null;
    }

    @Override
    public void insertMany(List<Book> books) {

    }
}
