package authors;

import authors.model.Author;
import authors.model.Sex;
import dbconf.BookstoreDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorDaoImpl implements AuthorDao {

    @Override
    public void updateByBookId(Author author, int id) {

    }

    @Override
    public Author find(int id) {

        String selectQuery = "seect * from authors where id = ?";
        try(Connection con = BookstoreDataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(selectQuery)) {

            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Author author = new Author();
                author.setSex(Sex.valueOf(resultSet.getString("sex")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }
}
