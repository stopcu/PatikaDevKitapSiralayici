package stopcu.book;

import java.util.Comparator;

public class BookOrderPage implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        
        return Integer.valueOf(o1.getSayfaSayisi()).compareTo(Integer.valueOf(o2.getSayfaSayisi()));
    }
    
}
