public class Book {
    private String name;
    private int page;
    private String authorName;
    private int publishTime;


    public Book(String name,int page,String authorName,int publishTime){
        this.name = name;
        this.page = page;
        this.authorName = authorName;
        this.publishTime = publishTime;
    }
    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public String getAuthorName() {
        return authorName;
    }
}
