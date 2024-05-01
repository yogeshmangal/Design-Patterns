public class Test {
    public static void main(String[] args) {
        Developer developer = DeveloperFactory.getDeveloper(new SoftwareDeveloperFactory());
        System.out.println(developer.getName());
        System.out.println(developer.getSalary());

        Developer developer2 = DeveloperFactory.getDeveloper(new WebDeveloperFactory());
        System.out.println(developer2.getName());
        System.out.println(developer2.getSalary());
    }
}
