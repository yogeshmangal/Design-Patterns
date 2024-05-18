public class DeveloperFactory {
    public static Developer getDeveloperObject(String name) {
        switch(name) {
            case "WebDeveloper":
                return new WebDeveloper();
            case "SoftwareDeveloper":
                return new SoftwareDeveloper();
            default:
                return null;
        }
    }
}
