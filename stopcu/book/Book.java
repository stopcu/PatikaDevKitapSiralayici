package stopcu.book;

import java.util.Date;

public class Book implements Comparable<Book> {

    private String isim;

    private int sayfaSayisi;

    private String yazarIsmi;

    private Date yayinTarihi;

    

    public Book(String isim, int sayfaSayisi, String yazarIsmi, Date yayinTarihi) {
        this.isim = isim;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarIsmi = yazarIsmi;
        this.yayinTarihi = yayinTarihi;
    }

    @Override
    public int compareTo(Book o) {
        return getIsim().compareTo(o.getIsim());
    }

    

    @Override
    public String toString() {
        return getIsim();
    }

    public String getIsim() {
        return isim;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public String getYazarIsmi() {
        return yazarIsmi;
    }

    public Date getYayinTarihi() {
        return yayinTarihi;
    }

    
}
