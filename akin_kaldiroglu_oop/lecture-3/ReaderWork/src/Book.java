public class Book {
    private String title;
    Author author;
    private int page;
    private String type;
    private boolean isHardCover;
    private int currentPage;
    public Book(String title,int page,int type,boolean isHardCover,String authorName){
        this.currentPage = 0;
        this.title = title;
        this.page = page;
        switch (type){
            case 1:
                this.type = typeOfBook.ROMAN.name();
                break;
            case 2:
                this.type = typeOfBook.STORY.name();
                break;
            case 3:
                this.type = typeOfBook.MAGAZINE.name();
                break;
            case 4:
                this.type = typeOfBook.NEWSPAPER.name();
                break;
        }
        this.isHardCover = isHardCover;
        author = new Author(authorName);
    }


    private enum typeOfBook{
        ROMAN,
        STORY,
        MAGAZINE,
        NEWSPAPER
    }
    public int nextPage(int lastPage){
        this.currentPage = lastPage;
        return currentPage;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPage() {
        return page;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public void setPage(int page) {
        this.page = page;
    }

}
