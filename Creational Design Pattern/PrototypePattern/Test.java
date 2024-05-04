public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Novelty");
        bs.loadData();

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("BookHub");

        System.out.println(bs);
        System.out.println(bs1);
    }
}
