package books.rs;

import books.model.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookExtractor {

    public static List<Book> extractBooks(ResultSet rs) throws SQLException {

        List<Book> books = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setPublisherId((rs.getInt("publisher_id")));
            book.setCategoryId((rs.getInt("category_id")));
            book.setIsbn(rs.getLong("isbn"));
            book.setTitle(rs.getString("title"));
            book.setPagesNumber(rs.getInt("pages_number"));
            books.add(book);
        }
        return books;
    }

}
