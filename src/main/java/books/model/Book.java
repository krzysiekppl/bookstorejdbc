package books.model;

public class Book {

    private Integer id;
    private String title;
    private Integer pagesNumber;
    private Long isbn;
    private Integer categoryId;
    private Integer publisherId;



    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPagesNumber(Integer pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPagesNumber() {
        return pagesNumber;
    }

    public Long getIsbn() {
        return isbn;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", isbn=" + isbn +
                ", categoryId=" + categoryId +
                ", publisherId=" + publisherId +
                '}' + '\n';
    }
}
