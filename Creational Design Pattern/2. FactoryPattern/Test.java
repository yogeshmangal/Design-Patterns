public class Test {
    public static void main(String[] args) {
        Developer developer = DeveloperFactory.getDeveloperObject("SoftwareDeveloper");
        System.out.println(developer.getSalary());

        Developer developer2 = DeveloperFactory.getDeveloperObject("WebDeveloper");
        System.out.println(developer2.getSalary());
    }
}
