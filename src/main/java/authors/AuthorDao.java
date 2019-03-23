package authors;

import authors.model.Author;

public interface AuthorDao {

    void updateByBookId(Author author, int id);

    Author find(int id);

}
