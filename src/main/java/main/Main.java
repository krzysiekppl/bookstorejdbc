package main;

import books.*;
import books.BookDaoImpl;
import books.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        BookDao bookDao = new BookDaoImpl();

        book.setTitle("CoKolwiek2");
        book.setPagesNumber(102);
        book.setIsbn(111111112211111111L);
        book.setCategoryId(2);
        book.setPublisherId(2);

        //bookDao.insert(book);

        List<Book> books = bookDao.findByAuthorFullName("Harlan Coben");

        System.out.println(books);

//        Connection connection = null;
//        try {
//             connection =
//                    DriverManager
//                            .getConnection("jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC",
//                            "root","password");
//
//             String selectBooksQuery = "select * from books;";
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(selectBooksQuery);
//
//            List<Book> books = new ArrayList<Book>();
//
//
//            while (resultSet.next()){
//                Book book = new Book();
//                book.setId(resultSet.getInt("id"));
//                book.setTitle(resultSet.getString("title"));
//                book.setPagesNumber(resultSet.getInt("pages_number"));
//                book.setIsbn(resultSet.getLong("isbn"));
//                book.setCategoryId(resultSet.getInt("category_id"));
//                book.setPublisherId(resultSet.getInt("publisher_id"));
//                books.add(book);
//
//
////                System.out.println(resultSet.getInt("id"));
//            }
//            System.out.println(books);



//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
       // }
    }
}
