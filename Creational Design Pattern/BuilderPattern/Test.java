public class Test {
    public static void main(String[] args) {
        //Without PhoneBuilder, we need to set all the attributes of phone
        Phone phone = new Phone("Android", 2, "qualcom", 5.5, 5000);
        System.out.println(phone);

        //Using PhoneBuilder we are able to set only 2 attributes
        Phone phone2 = new PhoneBuilder().setRam(4).setProcessor("Qualcom").getPhone();
        System.out.println(phone2);
    }
}
