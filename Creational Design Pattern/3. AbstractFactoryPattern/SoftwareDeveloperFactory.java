public class SoftwareDeveloperFactory extends DeveloperAbstractFactory {
    @Override
    public Developer getDeveloper() {
        return new SoftwareDeveloper();
    }
}
