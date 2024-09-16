package Homework.BookSort;


import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String name;
    private int id;
    private int pageNumber;

    public Book(String name,int id,int pageNumber){
        this.name = name;
        this.id = id;
        this.pageNumber = pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //This compareTo method can be able to inside. When we want to use others we need to use compare o1 and o2
    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}

