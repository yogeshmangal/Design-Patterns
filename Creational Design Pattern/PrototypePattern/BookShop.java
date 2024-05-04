import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    // just assume that loadData loads the data from database and that is costly. So for first time
    // object creation we use loadData() method and for next time, we will clone the first object.
    public void loadData() {
        for (int i = 1; i <= 10; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book" + i);
            this.getBooks().add(b);
        }
    }

    /*  Shallow copy  */

//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    /*  Deep copy  */
    protected BookShop clone() {
        BookShop bs = new BookShop();
        for (Book b : this.books) {
            bs.getBooks().add(b);
        }
        return bs;
    }
}
