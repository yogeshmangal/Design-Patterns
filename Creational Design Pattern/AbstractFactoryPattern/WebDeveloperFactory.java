public class WebDeveloperFactory extends DeveloperAbstractFactory {
    @Override
    public Developer getDeveloper() {
        return new WebDeveloper();
    }
}
