package Homework.BookSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("The Science",1,95));
        bookSet.add(new Book("The Red Book",4,255));
        bookSet.add(new Book("The AirCraft Book",3,122));
        bookSet.add(new Book("Super Minds",2,155));
        bookSet.add(new Book("How to read a book",5,200));
        bookSet.add(new Book("Apple",6,212));
        List<Book> bookList = new ArrayList<>(bookSet);
        //For alphabet
        Collections.sort(bookList);
        for(int i = 0;i<bookList.size();i++){
            System.out.println("ID : "+ bookList.get(i).getId()+" Book Name : "+ bookList.get(i).getName() + " Page: "+bookList.get(i).getPageNumber());
        }
        System.out.println("---");
        //For id
        bookList.sort(new ComparatorById());
        for(int i = 0;i<bookList.size();i++){
            System.out.println("ID : "+ bookList.get(i).getId()+" Book Name : "+ bookList.get(i).getName() + " Page: "+bookList.get(i).getPageNumber());
        }
        System.out.println("---");
        //For page number
        bookList.sort(new ComparatorByPageNumber());
        for(int i = 0;i<bookList.size();i++){
            System.out.println("ID : "+ bookList.get(i).getId()+" Book Name : "+ bookList.get(i).getName() + " Page: "+bookList.get(i).getPageNumber());
        }

    }
}
