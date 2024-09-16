package Homework.BookSort;

import java.util.Comparator;


public class ComparatorByPageNumber implements Comparator<Book>{


    @Override
    public int compare(Book o1,Book o2) {
        //return o2.getPageNumber() - o1.getPageNumber(); for reverse sort
        return o1.getPageNumber() - o2.getPageNumber();
    }
}
