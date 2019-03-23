package books;

import books.model.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookDaoImplTest {

    private BookDao bookDao;

    @Before
    public void setUp() throws Exception {
        bookDao = new BookDaoImpl();

    }

    @Test
    public void shouldDeleteBookById() {
        Book book = new Book();

        book.setTitle("CoKolwiek3");
        book.setPagesNumber(102);
        book.setIsbn(111111112211111111L);
        book.setCategoryId(2);
        book.setPublisherId(2);

        bookDao.insert(book);

        List<Book> coKolwiek3 = bookDao.findByTitle("CoKolwiek3");
        bookDao.delete(coKolwiek3.get(0).getId());
        List<Book> result = bookDao.findByTitle("CoKolwiek3");
        assertEquals(0, result.size());
    }
}